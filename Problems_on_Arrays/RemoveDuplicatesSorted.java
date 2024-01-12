package Problems_on_Arrays;

import java.util.*;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[k] != arr[j]) {
                k++;
                arr[k] = arr[j];
            }
        }
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k+1; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();


    }
    
}
