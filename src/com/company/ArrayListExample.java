package com.company;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // write your code here
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("goodbye");
        System.out.println(words);

        // .add() allows two arguments to add an element in a specific position
        words.add(0, "am i first?");
        System.out.println(words);

        // what other methods do we have? . game to the rescue: (it's a bunch of methods)
//        words.
        // play with some of them!
    }
}