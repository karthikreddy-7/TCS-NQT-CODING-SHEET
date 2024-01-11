package Problems_on_Arrays;

import java.util.Scanner;

public class RotateArray {
            public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        sc.close();


    }
    
}
