package Problems_On_String;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        String c="car";
        String m="acr";
        boolean ans=Anagram(c,m);
        System.out.println(ans);
    }
    public static boolean Anagram(String s,String t ){
        int [] count=new int[26];
        if(s.length()!=t.length()){
            return false;
        }


        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
             for (int i = 0; i < t.length(); i++) {
                 count[s.charAt(i) - 'a']--;
             }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0){
                return false;

            }


        }
        return true;




    }
}
