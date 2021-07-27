package com.ReverseString;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String str = "I am Khushbu Kareliya";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("With String Builder");
        System.out.println(sb.reverse());

 /** Another short way!**/
//        System.out.println(new StringBuilder(str).reverse().toString());
    }
}
