package com.kerwin.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        long res = 0;
        do {
            res = res * 10 + x % 10;
        } while ((x = x / 10) != 0);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(1534236469));
        System.out.println(new ReverseInteger().reverse(1534236469));
        System.out.println(Integer.MAX_VALUE == Math.pow(2, 31) - 1);
    }
}
