package com.ReverseString;

import java.util.*;

public class ReverseStringUsingListIterator {

    public static void main(String[] args) {
        String str = "I am Khushbu.";
        char [] char_arr = str.toCharArray();

        List<Character> char_list = new ArrayList<>();

        for (char c:char_arr)
        {
            char_list.add(c);
        }

        Collections.reverse(char_list);

        ListIterator iterator = char_list.listIterator();
        while(iterator.hasNext())
        {

           System.out.print(iterator.next());

        }

    }
}
