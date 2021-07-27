package com.ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am Khushbu Kareliya";

        char [] ch = str.toCharArray();
        for(int i = ch.length -1 ; i>=0; i--)
        {
            System.out.print(ch[i]);
        }
    }

}

