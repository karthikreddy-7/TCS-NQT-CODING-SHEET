package Problems_On_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Word:");
        String s = sc.nextLine();
        String res = "";
        for (char c : s.toCharArray()) {
            res = c + res;
        }
        System.out.println("the Reversed String is " + res);
        sc.close();
    }

}
