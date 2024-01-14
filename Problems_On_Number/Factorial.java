package Problems_On_Number;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int prod = 1;
        while (n > 0) {
            prod *= n;
            n--;
        }
        System.out.println("the factorial of the number is " + prod);
        sc.close();
    }

}
