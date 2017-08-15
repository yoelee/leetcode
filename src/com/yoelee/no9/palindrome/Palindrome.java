package com.yoelee.no9.palindrome;
/*
Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int a = x, b = 0;

        while(a > 0){
            b = b*10 + a % 10;
            a = a / 10;
        }

        return x==b;
    }
    public static void main(String [] args){
        Palindrome a = new Palindrome();
        System.out.println(a.isPalindrome(12344321));
    }
}
