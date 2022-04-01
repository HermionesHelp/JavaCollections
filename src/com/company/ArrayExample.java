package com.company;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        // we saw these yesterday
        String[] someWords = {"hello", "goodbye", "Fred", "Astaire"};
        System.out.println(someWords); // no good
        System.out.println(Arrays.toString(someWords)); // much better

        // we have bracket notation
        someWords[0] = "yes";
        someWords[1] = "no";
        someWords[3] = "Flinstone";
        System.out.println(Arrays.toString(someWords));

        // ordered by index, fixed in size (and type)
    }
}