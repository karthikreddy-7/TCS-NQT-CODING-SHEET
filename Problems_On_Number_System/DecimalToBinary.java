package Problems_On_Number_System;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Decimal value:");
        int n = sc.nextInt();
        String s = "";
        while (n > 0) {
            int remainder = n % 2;
            s = remainder + s;
            n = n / 2;
        }
        System.out.println("the binary value is " + s);
        sc.close();
    }

}
