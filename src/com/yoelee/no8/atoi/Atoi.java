package com.yoelee.no8.atoi;

/*
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 */
public class Atoi {
    public int myAtoi(String str) {
        if(str==null || str.trim().length()==0){
            return 0;
        }
        str = str.trim();
        int flag = 1;
        if(str.charAt(0)=='-'){
            flag = -1;
            str = str.substring(1,str.length());
        }else if(str.charAt(0)=='+'){
            str = str.substring(1,str.length());
        }

        String tmp = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i)<'0' || str.charAt(i)>'9'){
                break;
            }else{
                tmp += str.charAt(i);
            }
        }

        if(tmp.length()>10){
            if(flag > 0) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }else if (tmp.length()==10){
            if(flag > 0 && tmp.compareTo("2147483647")>0){
                return Integer.MAX_VALUE;
            }else if(flag < 0 && tmp.compareTo("2147483648")>0){
                return Integer.MIN_VALUE;
            }
        }

        int result = 0;
        for(int i = 0; i < tmp.length(); i++){
            result += (tmp.charAt(i)-'0')*Math.pow(10,tmp.length()-i-1);
        }

        return result*flag;
    }
    public static void main(String [] args){
        Atoi a = new Atoi();
        System.out.println(a.myAtoi("  -0012a42"));
        System.out.println(a.myAtoi("-123"));
        System.out.println(a.myAtoi("    010"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
