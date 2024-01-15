package Problems_On_Number;

import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int dummy = n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (dummy % sum == 0) {
            System.out.println("it is a harshad number.");
        } else
            System.out.println("it is not a harshad number.");
        sc.close();
    }

}
