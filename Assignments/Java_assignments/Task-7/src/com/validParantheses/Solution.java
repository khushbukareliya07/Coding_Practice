package com.validParantheses;
import java.util.*;
import java.util.Map;
class Solution {
    public boolean isValid(String s)
    {

        if(s == null || s.length() <= 1)
        {
            return false;
        }

        Map<Character, Character> bracket_map = new HashMap<Character, Character>()
        {
            {
                put('(',')');
                put('[',']');
                put('{','}');
            }
        };
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray())
        {
            if(bracket_map.containsKey(c))
            {
                System.out.println(c + " pushed");
                stack.push(c);
            }


                if(!stack.isEmpty() && bracket_map.get(stack.pop()) == c )
                {
                    System.out.println("Poped and Continuing . . ");
                    continue;
                }
                else
                {
                    System.out.println("eturning from else as False.");
                    return false;
                }


        }
        return stack.isEmpty() ?  true :  false;

    }
}