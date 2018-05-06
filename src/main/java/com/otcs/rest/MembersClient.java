package com.otcs.rest;

import com.otcs.rest.schemas.Member;
import com.otcs.rest.schemas.Result;
import com.otcs.rest.schemas.V2ResponseList;
import com.otcs.rest.services.MembersService;
import retrofit2.Call;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kishore Kumar on 07-05-2018.
 */
public class MembersClient {

    private MembersService service;

    public MembersClient(){
        service = ServiceGenerator.createService(MembersService.class);
    }

    public List<Member> search(){

        List<Member> members = new ArrayList<>();

        Call<V2ResponseList<Member>> call = service.search();

        try {
            V2ResponseList<Member> response = call.execute().body();
            for (Result<Member> result: response.getResults()) {
                members.add(result.getData().getProperties());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return members;
    }
}
