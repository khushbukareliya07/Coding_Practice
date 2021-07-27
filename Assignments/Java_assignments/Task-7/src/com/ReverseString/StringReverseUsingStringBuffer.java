package com.ReverseString;

public class StringReverseUsingStringBuffer {
    public static void main(String[] args) {
        String str = "I am Khushbu Kareliya......";
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse());

    }
}
