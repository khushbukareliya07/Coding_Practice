package com.countCharacterOccurrencesinString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class countChracterFrequency {
    public static void main(String[] args) {
        String str = "aabbccdde";
        char [] arr = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c:arr)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }


        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry dataset = (Map.Entry) iterator.next();
            System.out.println(dataset.getKey()+ "----> "+dataset.getValue());
        }
    }
}
