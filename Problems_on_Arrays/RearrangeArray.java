package Problems_on_Arrays;

import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //increasing order: (bubble sort)
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //displaying result: 
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //decreasing order: (bubble sort)
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //displaying result:
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();


    }
    
}
