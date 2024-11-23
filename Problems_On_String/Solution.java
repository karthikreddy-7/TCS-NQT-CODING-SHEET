package Problems_On_String;

import java.util.*;
// https://leetcode.com/problems/integer-to-roman/

class Solution {
    private static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] notations = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length && num > 0; ++i) {
            while (num >= values[i]) {
                roman.append(notations[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        String ans =practise1(13);
        System.out.println(ans);
        String ans1=intToRoman(13);
        System.out.println(ans1);
    }
        private static String practise1(int  a){
        int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
                String[] notions={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
                StringBuffer stringBuffer=new StringBuffer();

                if(values.length==notions.length){
                    System.out.println("matched");
                }

            for (int i = 0; i < values.length && a>0;  ++i) {
                while(a>=values[i]){
                    stringBuffer.append(notions[i]);
                    a-=values[i];
                }

            }
            return stringBuffer.toString();
        }
}
