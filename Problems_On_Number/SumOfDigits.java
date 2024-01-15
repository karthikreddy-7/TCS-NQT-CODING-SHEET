package Problems_On_Number;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sumofdigits = 0;
        while (n > 0) {
            sumofdigits += n % 10;
            n /= 10;
        }
        System.out.println("sum of the digits is " + sumofdigits);
        sc.close();
    }
}
