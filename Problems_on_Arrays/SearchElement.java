package Problems_on_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the key element to be searched: ");
        int key=sc.nextInt();
        //Linear Search:
        Boolean found=false;
        for (int i=0;i<n;i++){
            if (arr[i]==key){
                System.out.println("Key found at "+i+" position in the array Using Linear Search.");
                found=true;
            }
        }
        if (!found){
            System.out.println("Key element not found.");
        }
        //Binary Search:
        int l=0;
        int r=n-1;
        Arrays.sort(arr);
        while (l<=r){
            int mid=(l+r)/2;
            if (arr[mid]==key){
                System.out.println("Key found at "+mid+" position in the array Using Linear Search.");
                break;                
            }
            else if (arr[mid]<key){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        sc.close();        
    }

    
}
