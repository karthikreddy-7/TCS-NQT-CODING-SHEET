package Problems_On_Number;

import java.util.Scanner;

public class MaxMinDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (n > 0) {
            int temp = n % 10;
            max = Math.max(max, temp);
            min = Math.min(max, temp);
            n /= 10;
        }
        System.out.println("the Maximum Digit is " + max);
        System.out.println("the minimum digit is " + min);
        sc.close();
    }

}
