package Problems_On_String;

import java.util.Arrays;
//https://leetcode.com/problems/find-the-difference/
class Solution_389 {
    public static char findTheDifference(String s, String t) {
        
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.append(t);
        String  ar= String.valueOf(sb);
        char[] arr=ar.toCharArray();
        System.out.println(Arrays.toString(arr));

       int ans=0;
        for (int i = 0; i < arr.length; i++) {
            int help=(int)(arr[i]);

            ans=ans^help;

        }

        char c=(char)(ans);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

}