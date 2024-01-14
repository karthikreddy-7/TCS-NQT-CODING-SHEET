package Problems_On_Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + (i + 1) + " element of the array");
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        mergesort(arr, l, r);
        System.out.println("the sorted array using Merge sort is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void mergesort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = 0;
        int[] b = new int[r - l + 1];

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }

        while (j <= r) {
            b[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0; k < b.length; k++) {
            arr[l + k] = b[k];
        }
    }
}
