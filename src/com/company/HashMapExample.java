package com.company;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("firstName", "Mary");
        myHashMap.put("middleName", "Catherine");
        myHashMap.put("lastName", "Gallagher");

        System.out.println(myHashMap);

        // how can we access a value by a key?
//        System.out.println(myHashMap.get("firstName"));
        // System.out.println(myHashMap["lastName"]); -> java doesn't support this
    }
}