package Problems_On_Number;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("it is even");
        else
            System.out.println("it is not a even number.");
        sc.close();
    }

}
