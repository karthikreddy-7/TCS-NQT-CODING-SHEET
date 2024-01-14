package Problems_On_Number;

import java.util.Scanner;

/*
 * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits 
 * is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the 
 * Armstrong Numbers.


 */
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int digits = 0;
        int sum = 0;
        int dummy = n;
        while (dummy > 0) {
            digits++;
            dummy /= 10;
        }
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("it is a armstrong number.");
        } else {
            System.out.println("it is  not armstrong number as the sum is " + sum);
        }
        sc.close();
    }

}
