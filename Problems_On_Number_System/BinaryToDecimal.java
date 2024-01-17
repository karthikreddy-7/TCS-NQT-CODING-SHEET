package Problems_On_Number_System;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary string:");
        String s = sc.nextLine();
        double res = 0;
        int pow = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                res = res + Math.pow(2, pow);
            pow++;
        }
        System.out.println("the integer value is " + res);
        sc.close();
    }

}
