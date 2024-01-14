package Problems_On_Number;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("the sum of " + n + " natural numbers is " + sum);
        sc.close();
    }
}
