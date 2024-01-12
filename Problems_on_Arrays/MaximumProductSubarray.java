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
        //optimised kadane's algo approach:
        int maxprod=Integer.MIN_VALUE;
        int leftprod=1;
        int rightprod=1;
        for (int i=0;i<n;i++){
            //if any leftproduct or right product becomes zero then update it to one to avoid getting zero on further iterations of next sub array
            leftprod = leftprod == 0 ? 1 : leftprod;
            rightprod=rightprod == 0 ? 1 : rightprod;
            leftprod*=arr[i];
            rightprod*=arr[n-i-1];
            maxprod=Math.max(maxprod,Math.max(leftprod,rightprod));

        }
        System.out.println("maximum product subarray is "+max);
        System.out.println("maximum product subarray Using Kadane's optimised approach "+maxprod);
        sc.close();
    }
    
}
