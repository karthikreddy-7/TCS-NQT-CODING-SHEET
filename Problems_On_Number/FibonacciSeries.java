package Problems_On_Number;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(0);
        } else {
            int secondLast = 0;
            int last = 1;
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(secondLast + " " + last + " ");
            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;
                secondLast = last;
                last = cur;
                System.out.print(cur + " ");
            }
        }
        sc.close();
    }

}
