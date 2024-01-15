package Problems_On_Number;

import java.util.Scanner;

public class Permutations {
    static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n = sc.nextInt();
        System.out.println("enter the value of R:");
        int r = sc.nextInt();
        int num = fact(n);
        int den = fact(n - r);
        System.out.print(num / den);
        sc.close();
    }

}
