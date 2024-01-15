package Problems_On_Number;

import java.util.Scanner;

/*
 *  If the sum of divisors of a number is greater than the number then it is called abundant number. 
 */
public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sumofdivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumofdivisors += i;
            }
        }
        if (sumofdivisors > n)
            System.out.println("it is a Abundant Number.");
        else
            System.out.println("it is not a Abundant number");
        sc.close();
    }
}
