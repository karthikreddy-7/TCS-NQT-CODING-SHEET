package Problems_on_Arrays;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n ];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int tempmax=arr[i];
            for (int j=i+1;j<n;j++){
                tempmax*=arr[j];
                max=Math.max(max,tempmax);
            }
            
        }
        System.out.println("maximum product subarray is "+max);
        sc.close();
    }
    
}
