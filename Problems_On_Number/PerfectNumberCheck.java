package Problems_On_Number;

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.println("it is a perfect number");
        else
            System.out.println("it is not a perfect number as the sum of its factors is " + sum);
        sc.close();
    }

}
