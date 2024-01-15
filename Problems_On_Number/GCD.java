package Problems_On_Number;

import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int ans = gcd(a, b);
        System.out.print("The GCD of the two numbers is " + ans);
        sc.close();
    }

}
