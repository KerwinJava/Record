package com.kerwin.leetcode;

public class ToLowerCase {
    public String toLowerCase1(String str) {
        return str.toLowerCase();
    }

    public String toLowerCase(String str){
        byte[] bytes = str.getBytes();
        for(int i = 0;i<bytes.length;i++){
            byte b = bytes[i];
            if(b<=90&&b>=65){
                bytes[i] = (byte) (b + 32);
            }
        }
        return new String(bytes);
    }

    public static void main(String[] args) {
        byte[] a = "abc".getBytes();
        System.out.println((int)"a".charAt(0));
        System.out.println((int)"z".charAt(0));
        System.out.println((int)"A".charAt(0));
    }
}
