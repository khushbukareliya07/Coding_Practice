package com.Leetcode42_TrappingWater;

import java.util.Arrays;

public class Solution {

    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int temp_left = 0, temp_right = 0;

        int length = height.length;
        int traped_water = 0;
        //Storing Left and Right Element
        if(length >=3)
        {
           System.out.println("Inside Main If, blocks are more than 3");
           for (int i = 0; i < length; i++) {
               left[i] = (i == 0 ? 0 :temp_left);
               temp_left = Math.max(temp_left, height[i]);
            }

            for (int i = length - 1; i >= 0; i--) {
                right[i] = (i == length - 1 ? 0 : temp_right);
                temp_right = Math.max(temp_right, height[i]);
            }
            System.out.println("Left Array : "+ Arrays.toString(left));
            System.out.println("Right Array : "+Arrays.toString(right));

            for (int i = 0; i < length; i++) {
                int min =  Math.min(left[i], right[i]);
                if(min== 0 )
                {
                    traped_water = traped_water+0;
                  // System.out.println("traped water :" + traped_water + "  i = " + i);
                }
                else
                {
                    int storage = min- height[i];
                    if(storage <=0) {
                        traped_water = traped_water + 0;
                    }
                    else {
                        traped_water = traped_water + ((min - height[i]) * 1);
                    }

                }
                System.out.println("traped water :" + traped_water + "  i = " + i);
            }
            System.out.println("Traped water inside if loop : "+traped_water);
            return traped_water;
        }

       return -1;
    }

}
