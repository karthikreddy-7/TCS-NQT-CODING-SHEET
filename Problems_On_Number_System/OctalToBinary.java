package Problems_On_Number_System;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the octal value:");
        String s = sc.nextLine();
        int decimal = 0;
        int pow = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = s.charAt(i) - '0';
            decimal += (val * Math.pow(8, pow));
            pow++;
        }
        System.out.println(decimal);
        // now decimal to binary conversion
        String bin = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            bin = remainder + bin;
            decimal = decimal / 2;
        }
        System.out.println("the binary value is " + bin);
        sc.close();
    }

}
