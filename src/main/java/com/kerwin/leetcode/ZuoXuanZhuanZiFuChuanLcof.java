package com.kerwin.leetcode;

public class ZuoXuanZhuanZiFuChuanLcof {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n)+s.substring(0,n);
    }

    public static void main(String[] args) {
        System.out.println(new ZuoXuanZhuanZiFuChuanLcof().reverseLeftWords("abcdefg",2));
    }

}
