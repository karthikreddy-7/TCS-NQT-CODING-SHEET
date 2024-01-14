package Problems_On_Number;

import java.util.Scanner;

/*
 *  A number is called an Automorphic number if and only if 
 * its square ends in the same digits as the number itself.
 */
public class AutomorphicCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        int dummy = n;
        while (n > 0) {
            int temp = n % 10;
            sum += fact(temp);
            n /= 10;
        }
        if (sum == dummy)
            System.out.println("it is a strong number.");
        else
            System.out.println("it is not a strong number." + sum);
        sc.close();
    }
}
