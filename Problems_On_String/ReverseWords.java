package Problems_On_String;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        String reverse = "";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                reverse = res + " " + reverse;
                res = "";
            } else {
                res = res + s.charAt(i);
            }
        }
        reverse = res + " " + reverse;
        System.out.println("reversed string is " + reverse);
        sc.close();
    }

}
