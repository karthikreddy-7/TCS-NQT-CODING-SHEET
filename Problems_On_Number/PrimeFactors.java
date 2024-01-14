package Problems_On_Number;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("the Prime factors are ");
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {

                while (n % i == 0) {

                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
        sc.close();
    }

}
