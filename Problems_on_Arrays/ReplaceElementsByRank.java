package Problems_on_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReplaceElementsByRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n ];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //duplicate array:
        int[] duplicate = Arrays.copyOf(arr, arr.length);

        Arrays.sort(duplicate);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(duplicate[i],i+1);
        }
        //now making the ranking array
        int[] res=new int[n];
        for (int i=0;i<n;i++){
            int temp=map.get(arr[i]);
            res[i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    
}
