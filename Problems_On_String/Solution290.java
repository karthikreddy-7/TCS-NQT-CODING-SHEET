package Problems_On_String;

// https://leetcode.com/problems/word-pattern/

import java.util.Arrays;
import java.util.HashMap;

class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];


            if (map.containsKey(currentChar)) {
                if (!map.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                if (map.containsValue(currentWord)) {
                    return false;
                }
                map.put(currentChar, currentWord);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('a',"sharath");
        map.put('a',"sharath");
        if(map.get('a').equals("sharath")){
            System.out.println("sharath i love");
        }

        System.out.println(map);



    }
}
