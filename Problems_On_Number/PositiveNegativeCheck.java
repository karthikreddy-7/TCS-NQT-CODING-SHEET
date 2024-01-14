package Problems_On_Number;

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("it is Positive");
        else
            System.out.println("it is not a Negative number.");
        sc.close();
    }
}
