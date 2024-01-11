package Problems_on_Arrays;

import java.util.*;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        float median=0;
        if (n%2==0){
            median = (float)(arr[(n/2)-1]+arr[(n/2)])/2;
        } else{
            median=(arr[n/2]);
        }
        System.out.println("the median of the array is "+median);
        sc.close();


    }
}
