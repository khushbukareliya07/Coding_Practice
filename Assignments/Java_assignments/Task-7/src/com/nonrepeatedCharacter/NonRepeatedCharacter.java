/*** Program to find the first non-repeated character in the String  ***/

package com.nonrepeatedCharacter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "ayabcxcddbezefggf";
        char [] ch_arr = str.toLowerCase().toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : ch_arr)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }

//        System.out.println("Key    Value");
//        Iterator iterator = map.entrySet().iterator();
//        while (iterator.hasNext())
//        {
//            Map.Entry dataset = (Map.Entry) iterator.next();
////            if((int)dataset.getValue() == 1)
////            {
////                System.out.println("The very first non-repeated character is: "+dataset.getKey());
////                break;
////            }
//
//            System.out.println(" "+ dataset.getKey()+ "        "+(int)dataset.getValue());
//
//        }

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry dataset =  (Map.Entry)iterator.next(); //pointing to first element

            if((int)dataset.getValue() == 1)
            {
                System.out.println("Non-repeated characters: "+dataset.getKey());
                break;
            }
        }






    }
}
