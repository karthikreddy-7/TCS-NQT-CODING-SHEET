package Problems_On_Number;

import java.util.Scanner;

/*
 * When the sum of factorial of individual digits of a number is equal to the original number 
 * the number is called a strong number.
 */
public class StrongNumberCheck {
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

    public static int fact(int i) {
        if (i == 0) {
            return 1;
        }
        return i * fact(i - 1);
    }
}
