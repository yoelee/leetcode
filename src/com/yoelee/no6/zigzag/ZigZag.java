package com.yoelee.no6.zigzag;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZag {
    public String convert(String s, int numRows) {
        if (s==null || s.length()==0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i = i + 2*numRows-2){
            sb.append(s.charAt(i));
        }
        for (int j = 1; j < numRows-1; j ++){

        }

        for (int i = numRows-1; i < s.length(); i = i + 2*numRows-2){
            sb.append(s.charAt(i));
        }
        return null;
    }
    public static void main(String [] args){

    }
}
