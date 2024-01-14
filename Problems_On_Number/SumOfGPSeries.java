package Problems_On_Number;

import java.util.Scanner;

public class SumOfGPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N value :");
        int n = sc.nextInt();
        System.out.println("enter the A value :");
        int a = sc.nextInt();
        System.out.println("enter the R value :");
        float r = sc.nextFloat();
        float sum = a * ((float) Math.pow(r, n) - 1) / (r - 1);
        System.out.println("the sum of Geometric Progession " + sum);
        sc.close();
    }

}
