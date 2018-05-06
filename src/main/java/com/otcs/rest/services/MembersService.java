package com.otcs.rest.services;

import com.otcs.rest.schemas.Member;
import com.otcs.rest.schemas.V2ResponseList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Created by Kishore Kumar on 06-05-2018.
 */
public interface MembersService {

    @GET("api/v2/members")
    Call<V2ResponseList<Member>> search();

    @GET("api/v2/members")
    Call<V2ResponseList<Member>> search(@QueryMap Map<String,String> params);

    @GET("api/v1/members/{id}")
    Call<Member> member(@Path("id") int id);

}
