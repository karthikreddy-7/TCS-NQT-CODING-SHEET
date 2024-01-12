package Problems_on_Arrays;


import java.util.*;
import java.util.Scanner;

public class RemoveDuplicatesUnsorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //storing unique elements and adding it to List 
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for (int i : arr){
            if (!map.containsKey(i)){
                map.put(i,1);
                
            }
        }
        int[] res=new int[map.size()];
        int counter=0;
        for (int i:map.keySet()){
            res[counter]=i;
            counter++;
        }
        //displaying the output array
        for (int i=0;i<map.size();i++){
            System.out.print(res[i]+" ");
        }
        sc.close();


    }   
}
