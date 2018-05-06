package com.otcs.rest;


import com.otcs.rest.schemas.Member;

import java.io.IOException;
import java.util.List;

/**
 * Created by Kishore Kumar on 06-05-2018.
 */
public class TestMain {

    public static final String API_URL = "http://kksvr/cs/cs.exe/";

    public static void main(String... args) throws IOException {

        OTCSClient client = new OTCSClient();
        client.init(API_URL,"Admin","livelink","Basic");
        List<Member> members = client.members().search();
        String p = "ki";
    }
}
