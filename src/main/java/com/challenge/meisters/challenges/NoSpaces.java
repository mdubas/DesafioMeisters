package com.challenge.meisters.challenges;

public class NoSpaces {

    public static void main(String[] args) {

        String textWithSpaces = "Welcome to the city of New York!";
        StringBuilder text = new StringBuilder();

        for (char letter : textWithSpaces.toCharArray()) {
            if (letter != ' ') {
                text.append(letter);
            }
        }
        String textWithoutSpaces = text.toString();
        System.out.println(textWithoutSpaces);
    }
}