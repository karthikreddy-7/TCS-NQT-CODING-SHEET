package Problems_on_Arrays;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        float avg=(float)sum/n;
        System.out.println("the average of the array is "+avg);
        sc.close();


    }
    
}
