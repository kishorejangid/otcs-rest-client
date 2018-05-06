package com.otcs.rest.auth;


import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Kishore Kumar on 06-05-2018.
 */
public class BasicAuthInterceptor implements AuthInterceptor {

    private final String TYPE = "Basic";
    private final String credentials;

    public BasicAuthInterceptor(String user, String password) {
        this.credentials = Credentials.basic(user, password);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request authenticatedRequest = request.newBuilder()
                .header("Authorization", credentials).build();
        return chain.proceed(authenticatedRequest);
    }

    public String getType(){
        return TYPE;
    }
}
