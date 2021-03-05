package com.kerwin.leetcode;

public class ShuffleTheArray {
    public int[] shuffle2(int[] nums, int n) {
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        System.arraycopy(nums, 0, nums1, 0, n);
        System.arraycopy(nums, n, nums2, 0, n);
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums1[i / 2];
            } else {
                nums[i] = nums2[(i - 1) / 2];
            }
        }
        return nums;
    }

    public int[] shuffle(int[] nums, int n) {
        int temp = nums[0];
        for (int i = 0; i < 2 * n; i++) {
            System.out.println("temp: " + temp);
            if (i % 2 == 0) {
                int temp2 = nums[i];
                nums[i] = temp;
                temp = temp2;
            } else {
                int temp2 = nums[i];
                nums[i] = nums[n - 1 + (i + 1) / 2];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        shuffleTheArray.shuffle(new int[]{1,2,3,4,5,6,7,8,9,10}, 3);
    }
}
