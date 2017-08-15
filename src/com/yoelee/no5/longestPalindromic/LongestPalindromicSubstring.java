package com.yoelee.no5.longestPalindromic;

import com.yoelee.no3.longestSubstring.LongestSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = null;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = s.length() - 1; j >= i ; j --){
                if(s.charAt(i) == s.charAt(j)){
                    String tmp = s.substring(i,j+1);
                    if(check(tmp) && tmp.length() > max){
                        max = tmp.length();
                        result = tmp;
                        break;
                    }
                }
            }
            if(s.length()-i < max){
                break;
            }
        }
        return result;
    }
    public boolean check(String s){
        for(int i = 0; i <= s.length()/2-1; i++){
            //System.out.println("a="+s.charAt(i)+",b="+s.charAt(s.length()-i-1));
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        LongestPalindromicSubstring a = new LongestPalindromicSubstring();
        //System.out.println(a.check("abcda"));
        System.out.println(a.longestPalindrome("babad"));
        System.out.println(a.longestPalindrome("bbd"));
        System.out.println(a.longestPalindrome("abcda"));
        System.out.println(a.longestPalindrome("cbbd"));
        //System.out.println("liyakun".substring(0,3));
    }
}
