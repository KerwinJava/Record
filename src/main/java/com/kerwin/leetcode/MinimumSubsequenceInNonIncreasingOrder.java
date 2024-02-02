package com.kerwin.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yangjisheng
 */
public class MinimumSubsequenceInNonIncreasingOrder {

    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        List<Integer> res = new ArrayList<Integer>();
        int tempSum = 0;
        for (int i = nums.length-1; i >=0; i--) {
            tempSum += nums[i];
            res.add(nums[i]);
            if (tempSum * 2 > sum) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new MinimumSubsequenceInNonIncreasingOrder().minSubsequence(new int[]{4, 3, 10, 9, 8});
    }
}
