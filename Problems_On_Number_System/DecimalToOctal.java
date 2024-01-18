package Problems_On_Number_System;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal value:");
        int n = sc.nextInt();
        String octal = "";
        while (n > 0) {
            int temp = n % 8;
            octal = temp + octal;
            n = n / 8;
        }
        System.out.println("the octal value is " + octal);
        sc.close();

    }

}
