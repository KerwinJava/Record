package com.kerwin.leetcode;

/**
 * @author yangjisheng
 */
public class ConvertIntegerToSumOfTwoNonzero {

    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        while (i < n) {
            int j = n - i;
            if ((i / 10 > 0 && i % 10 == 0) || (i / 100 > 0 && i / 10 % 10 == 0) || (i / 1000 > 0 && i / 100 % 10 == 0)
                    || (j / 10 > 0 && j % 10 == 0) || (j / 100 > 0 && j / 10 % 10 == 0) || (j / 1000 > 0 && j / 100 % 10 == 0)) {
                i++;
                continue;

            }
            break;
        }
        return new int[]{i, n - i};
    }

    public int[] getNoZeroIntegers2(int n) {

        int a = 0, b = 0, c = 0, d = 0;
        if (n < 10) {
            return new int[]{1, n - 1};
        }
        //10-99  先取出个位
        int d1 = n % 10;
        d = d1 != 1 ? 1 : 2;

        //取出十位
        if (n >= 100) {
            int c1 = n / 10 % 10;
            c = c1 > 6 ? 3 : 8;
        }

        //取出百位
        if (n >= 1000) {
            int b1 = n / 100 % 10;
            b = b1 > 6 ? 3 : 8;
        }
        a = b * 100 + c * 10 + d;
        return new int[]{a, n - a};
    }

    public static void main(String[] args) {
        int[] res = new ConvertIntegerToSumOfTwoNonzero().getNoZeroIntegers2(101);
        System.out.println(101);
    }
}
