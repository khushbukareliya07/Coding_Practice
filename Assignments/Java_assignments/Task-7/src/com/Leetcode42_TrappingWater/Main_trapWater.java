package com.Leetcode42_TrappingWater;

public class Main_trapWater {
    public static void main(String[] args) {
        int[] height =  {0,1,0,2,1,0,1,3,2,1,2,1};
                      // 0,0,1,1,2,2,2,2,3,3,3,3 -- left
                     //  3,3,3,3,3,3,3,2,2,2,1,0
        Solution s = new Solution();
        int trapedwater = s.trap(height);
        System.out.println("The Water storage is : "+trapedwater);
    }

}
