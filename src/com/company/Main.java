package com.company;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        UserParser up = new UserParser();

        System.out.println(up.parseToList("programmer:vasia@123,programmer:vasia,vasia@1234,vasia,vasia@parara"));
    }
}
