package com.yoelee.no5.longestPalindromic;

public class LongestPalindromicSub3 {

    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String [] args){
        LongestPalindromicSub3 a = new LongestPalindromicSub3();
        //System.out.println(a.expandLen("abadda",3,4));
        System.out.println(a.longestPalindrome("babad"));
        System.out.println(a.longestPalindrome("bbd"));
        System.out.println(a.longestPalindrome("abcda"));
        System.out.println(a.longestPalindrome("cbbd"));
        System.out.println(a.longestPalindrome("a"));
    }
}
