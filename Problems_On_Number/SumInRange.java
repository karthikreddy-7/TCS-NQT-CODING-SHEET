package Problems_On_Number;

import java.util.Scanner;

public class SumInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the L value:");
        int l = sc.nextInt();
        System.out.println("enter the R value:");
        int r = sc.nextInt();
        // sum(1 to r) - sum(1 to l-1)
        int ans = (r * (r + 1)) / 2 - ((l - 1) * (l)) / 2;
        System.out.print("The sum of the numbers in the given range is " + ans);
        sc.close();
    }
}
