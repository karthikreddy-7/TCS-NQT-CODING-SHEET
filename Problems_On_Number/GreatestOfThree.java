package Problems_On_Number;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the Second number:");
        int num2 = sc.nextInt();
        System.out.println("enter the Third number:");
        int num3 = sc.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("the maximum value is " + max);
        sc.close();
    }

}
