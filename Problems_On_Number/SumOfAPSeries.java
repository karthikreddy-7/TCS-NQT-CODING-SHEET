package Problems_On_Number;

import java.util.Scanner;

public class SumOfAPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N value :");
        int n = sc.nextInt();
        System.out.println("enter the A value :");
        int a = sc.nextInt();
        System.out.println("enter the D value :");
        int d = sc.nextInt();
        int sum = (n / 2) * ((2 * a + (n - 1) * d));
        System.out.println("the sum of Arithematic Progession " + sum);
        sc.close();
    }

}
