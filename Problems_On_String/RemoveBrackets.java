package Problems_On_String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Word:");
        List<Character> brackets = Arrays.asList('(', ')'); // ypu can add other type of brackets too
        String s = sc.nextLine();
        String res = "";
        for (char c : s.toCharArray()) {
            if (!brackets.contains(c)) {
                res = res + c;
            }
        }
        System.out.println("the string with removing Brackets is " + res);
        sc.close();
    }
}
