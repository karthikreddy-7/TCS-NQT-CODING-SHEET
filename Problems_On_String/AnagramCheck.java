package Problems_On_String;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word1:");
        String s1 = sc.nextLine();
        System.out.println("enter word2:");
        String s2 = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        // putting the elements in the hasmap
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean flag = false;
        // removing elements from the hashmap
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                flag = true;
            } else {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            }
        }
        if (!flag && map.isEmpty()) {
            System.out.println("kudos ! they are anagrams");
        } else
            System.out.println("they are not anagrams.");
        sc.close();

    }
}
