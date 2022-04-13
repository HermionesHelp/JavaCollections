package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] oddNumbers = {1,3,5,7,9,11,13,15};
        // standard for loop that loops through all the elements in oddNumbers:
        for(int i = 0; i < oddNumbers.length; i++) {
            System.out.println(oddNumbers[i]);
        }

        // enhanced for loop (foreach):
//        for(int oddNumber : oddNumbers) {
//            System.out.println(oddNumber);
//        }

        // does it work on an arraylist?
//        ArrayList<String> words = new ArrayList<String>();
//        words.add("apple");
//        words.add("banana");
//        words.add("carrot");
//        for(int i = 0; i < words.size(); i++) {
//            System.out.println(words.get(i));
//        }

//        for(String word : words) {
//            System.out.println(word);
//        }

        // what about a HashMap
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("firstName", "Edna");
//        map.put("lastName", "Mode");
//        for(String key : map.keySet()) {
//            System.out.println("key: " + key);
//            System.out.println("value: " + map.get(key));
//            System.out.println(key + ": " + map.get(key));
//        }

    }
}