package Problems_On_String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelConsonantSpaceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String s = sc.nextLine();
        s = s.toLowerCase();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int vowelscount = 0;
        int consonantcount = 0;
        int spacecount = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                vowelscount++;
            } else if (c == ' ') {
                spacecount++;
            } else if (Character.isLetter(c) && !vowels.contains(c)) {
                consonantcount++;
            }
        }
        System.out.println(
                "vowels count=" + vowelscount + " consonants count=" + consonantcount + " Space count=" + spacecount);
        sc.close();
    }
}
