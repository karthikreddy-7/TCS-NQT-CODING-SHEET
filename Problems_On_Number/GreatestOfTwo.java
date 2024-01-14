package Problems_On_Number;

import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the Second number:");
        int b = sc.nextInt();
        int max = Math.max(a, b);
        System.out.println("the maximum value is " + max);
        sc.close();
    }

}
