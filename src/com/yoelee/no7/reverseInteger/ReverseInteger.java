package com.yoelee.no7.reverseInteger;
/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean zheng = true;
        if (x < 0){
            zheng = false;
            x = -x;
        }

        String num = String.valueOf(x);
        long result = 0;
        for(int i = num.length()-1; i >= 0; i--){
            result += (num.charAt(i) - '0')*Math.pow(10,i);
        }

        if(!zheng){
            result = -result;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            result = 0;
        }

        return (int)result;
    }
    public static void main(String []args){
        System.out.println(Integer.MAX_VALUE);
        ReverseInteger a = new ReverseInteger();
        System.out.println(a.reverse(2147483647));
    }
}
