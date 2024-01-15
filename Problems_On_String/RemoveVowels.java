package Problems_On_String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Word:");
        String s = sc.nextLine();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String res = "";
        for (char c : s.toCharArray()) {
            if (!vowels.contains(c)) {
                res = res + c;
            }
        }
        System.out.println("the string with removing vowels is " + res);
        sc.close();
    }

}
