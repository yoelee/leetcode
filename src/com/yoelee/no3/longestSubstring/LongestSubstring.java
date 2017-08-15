package com.yoelee.no3.longestSubstring;

/*
Given a string, find the length of the longest substring without repeating characters.

Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = 0;
        int m = 0;
        HashSet<Character> a = new HashSet<Character>();
        while (n < s.length() && m < s.length()){
            if (!a.contains(s.charAt(n))){
                a.add(s.charAt(n));
                n++;
                if (max < n-m){
                    max = n-m;
                }
            }else{
                a.remove(s.charAt(m));
                m ++;
            }
        }
        return max;
    }

    public static void main(String [] args){
        LongestSubstring a = new LongestSubstring();
        //System.out.println(a.lengthOfLongestSubstring("pwwkew"));
        System.out.println(a.lengthOfLongestSubstring("bpoiexpqhmebhhu"));
    }
}
