package Problems_On_Number_System;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Binary value:");
        String s = sc.nextLine();
        if (s.length() % 3 == 2) {
            s = "0" + s;
        } else if (s.length() % 3 == 1) {
            s = "00" + s;
        }
        String octal = "";
        for (int i = 0; i < s.length(); i += 3) {
            // Convert the three binary digits to octal
            int decimal = (s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0') * 1;
            octal += decimal;
        }
        System.out.println("the octal value is " + octal);
        sc.close();
    }

}
