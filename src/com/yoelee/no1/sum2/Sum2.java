package com.yoelee.no1.sum2;

/**
 *
 Given nums = [2, 7, 11, 15], target = 9,
 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */

public class Sum2 {
    public int [] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length -1; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
