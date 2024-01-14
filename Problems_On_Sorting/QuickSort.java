package Problems_On_Sorting;

import java.util.Scanner;

public class QuickSort {
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
        int h = n - 1;
        quicksort(arr, l, h);
        System.out.println("the sorted array using Quick sort is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void quicksort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            quicksort(arr, l, pivot - 1);
            quicksort(arr, pivot + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l]; // Choose the pivot as the first element
        int i = l;
        int j = h;

        while (i < j) {
            while (i < h && arr[i] <= pivot) {
                i++;
            }
            while (j > l && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
