package com.IntersectionOfArrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayIntersectionUsingMap {
    public static void main(String[] args) {

        int[] arr1 = {1,1,1,2,3,4,5,6,7,2,8,9};
        int[] arr2 = {11,12,13,14,25,15,6,7,8};

        Set<Integer> s1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        s1.retainAll(s2);

        Integer[] output = s1.toArray(new Integer[s1.size()]);
        System.out.println(Arrays.toString(output));


    }


}
