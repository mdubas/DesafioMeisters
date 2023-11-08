package com.challenge.meisters.challenges;

import java.util.Arrays;
import java.util.List;


public class FilterStrings {

    public static void main(String[] args) {

    List<String> text = Arrays.asList("Act", "quest", "fire", "ant", "art", "survey", "air", "Earth");

    List<String> filter = text.stream()
            .filter(word -> word.startsWith("a") && word.length() == 3)
            .toList();
        System.out.println(filter);
    }
}
