package com.otcs.rest;

/**
 * Created by Kishore Kumar on 06-05-2018.
 */
public class OTCSClient {

    private MembersClient membersClient;

    public void init(String baseURL,String userName,String password,String authType){
        ServiceGenerator.setBaseURL(baseURL);
        ServiceGenerator.setAuthentication(authType,userName,password);
    }

    public MembersClient members() {
        return new MembersClient();
    }
}
