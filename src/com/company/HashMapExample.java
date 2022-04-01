package com.company;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // write your code here
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("firstName", "Paul");
        myHashMap.put("lastName", "Matthews");
        System.out.println(myHashMap);

        // how can we access a value by a key?
        System.out.println(myHashMap.get("firstName"));
        // System.out.println(myHashMap["lastName"]); -> java doesn't support this
    }
}