package Problems_On_Number;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("enter the Power:");
        int p = sc.nextInt();
        System.out.println("the factorial of the number is " + Math.pow(n, p));
        sc.close();
    }
}
