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
        int N = sc.nextInt();
        int sq = N * N;
        boolean flag = false;
        while (N > 0) {
            // Check if last digit is equal or not
            if (N % 10 != sq % 10)
                flag = true;
            // Reducing the number and its square
            N /= 10;
            sq /= 10;
        }
        if (flag) {
            System.out.println("it is an AutoMorphic Number");
        } else
            System.out.println("it is Not an AutoMorphic Number");
        sc.close();
    }
}
