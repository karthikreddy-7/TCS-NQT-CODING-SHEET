package Problems_on_Arrays;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to add: ");
        int adder = sc.nextInt();
        System.out.println("Enter at which position you want to add:");
        int index = sc.nextInt();
        if (index == n) {
            arr[n] = adder;
        } else {
            rotateArray(arr, n, index, adder);
        }
        System.out.println("Updated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    static void rotateArray(int[] arr, int n, int index, int adder) {
        if (n < 0) {
            return;
        }
        int temp = arr[n];
        rotateArray(arr, n - 1, index, adder);
        if (n >= index) {
            arr[n + 1] = temp;
        } else {
            arr[index] = adder;
        }
    }
}
