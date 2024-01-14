package Problems_On_Number;

import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Year:");
        int n = sc.nextInt();
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("it is a Leap Year");
        } else
            System.out.println("it is not leap year");
        sc.close();
    }

}
