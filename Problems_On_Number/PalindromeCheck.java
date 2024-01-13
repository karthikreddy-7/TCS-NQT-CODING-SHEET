package Problems_On_Number;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int rev = 0;
        int dummy = n;
        while (n > 0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        if (dummy == rev) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome ");
        }
        sc.close();

    }
}
