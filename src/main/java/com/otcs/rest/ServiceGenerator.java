package com.otcs.rest;

import com.otcs.rest.auth.AuthInterceptor;
import com.otcs.rest.auth.BasicAuthInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kishore Kumar on 07-05-2018.
 */
public class ServiceGenerator {

    private static String baseURL = null;
    private static Retrofit retrofit;
    private static Retrofit.Builder builder;

    private static HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();

    static {
        okHttpClient.addInterceptor(logging);
    }

    private ServiceGenerator(){

    }

    public static <T> T createService(Class<T> serviceClass) {

        retrofit = builder.client(okHttpClient.build()).build();

        if(retrofit.baseUrl() == null){
            throw new IllegalStateException("Base URL is not configured.");
        }

        return retrofit.create(serviceClass);
    }

    public static void setAuthentication(String type,String userName,String password){
        AuthInterceptor interceptor = null;
        if(type == "OTDS"){

        }else{
            interceptor = new BasicAuthInterceptor(userName,password);
        }
        okHttpClient.addInterceptor(interceptor);
    }

    public static void setAuthentication(String userName,String password){
        setAuthentication("Basic",userName,password);
    }

    public static void setBaseURL(String baseURL) {
        ServiceGenerator.baseURL = baseURL;

        builder = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create());
    }

    /**
     * or Error Handing when non-OK response is received from Server
     */
    //@NonNull
    public static Retrofit retrofit() {
        OkHttpClient client =  okHttpClient.build();;
        return builder.client(client).build();
    }
}
