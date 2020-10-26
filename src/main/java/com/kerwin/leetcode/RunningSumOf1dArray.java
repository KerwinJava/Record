package com.kerwin.leetcode;

public class RunningSumOf1dArray {
    public int[] runningSum2(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i= 1 ;i<nums.length;i++){
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }

    public int[] runningSum(int[] nums) {
        for(int i= 1 ;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
