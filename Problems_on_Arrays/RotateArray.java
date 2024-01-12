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
        System.out.println("enter the value of K:");
        int k=sc.nextInt();
        //simplify k by using modulo operator with the length of the array
        k=k%n;
        //make a duplicate Array
        int[] res=new int[n];
        int counter=0;
        for (int i=k;i<n;i++){
            res[i]=arr[counter];
            counter++;
        }
        for (int i=0;i<k;i++){
            res[i]=arr[counter];
            counter++;
        }
        //displaying resultant array
        for (int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();


    }
    
}
