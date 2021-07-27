package com.StringUniqueCharacters;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharacters {
    public static void main(String[] args) {
        String str = "abcde";
        char[] strarray = str.toCharArray();
        Set<Character> characterSet = new HashSet<>();

        for (char c : strarray)
        {
            characterSet.add(c);
        }
        if(characterSet.size() == strarray.length)
            System.out.println("No characters are repeated!");
        else
            System.out.println("Repeated characters exists.");

    }
}
