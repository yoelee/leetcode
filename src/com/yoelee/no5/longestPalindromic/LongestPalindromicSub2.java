package com.yoelee.no5.longestPalindromic;

public class LongestPalindromicSub2 {
    public String longestPalindrome(String s) {
        String result = "";
        for(int i = 0; i < s.length(); i++){
            String le1 = expandLen(s,i,i);
            String le2 = "";
            if(i!=s.length()-1){
                le2 = expandLen(s,i,i+1);
            }
            if(result.length() < le1.length()){
                result = le1;
            }
            if(result.length() < le2.length()){
                result = le2;
            }
        }
        return result;
    }
    public String expandLen(String s, int left, int right){
        if(s.charAt(left)!=s.charAt(right)){
            return "";
        }
        while (left>=0 && right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                left --;
                right ++;
            }else {
                break;
            }
        }
        return s.substring(left+1,right);
    }
    public static void main(String [] args){
        LongestPalindromicSub2 a = new LongestPalindromicSub2();
        //System.out.println(a.expandLen("abadda",3,4));
        System.out.println(a.longestPalindrome("babad"));
        System.out.println(a.longestPalindrome("bbd"));
        System.out.println(a.longestPalindrome("abcda"));
        System.out.println(a.longestPalindrome("cbbd"));
        System.out.println(a.longestPalindrome("a"));
    }
}
