package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();
        for (char symbol : charactersInString) {
            if (symbol < 'a' || symbol > 'z') {
                continue;
            }
            letters.putIfAbsent(symbol, 0);
            letters.put(symbol, letters.get(symbol) + 1);
        }

        for (Map.Entry<Character,Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + "; " + entry.getValue());
        }
    }
}