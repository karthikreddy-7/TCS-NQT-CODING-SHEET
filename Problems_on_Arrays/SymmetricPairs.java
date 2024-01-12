package Problems_on_Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d.
 */

public class SymmetricPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of pairs");
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for (int i=0;i<n;i++){
            for (int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //creating a hashmap to store the elements so that we check if it is present in map or not
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println("the symetric pairs are ");
        for (int i=0;i<n;i++){
            int first=arr[i][0];
            int second=arr[i][1];
            if (map.containsKey(second) && map.get(second)==first){
                System.out.print("("+first+","+second+") ");
            }else{
                map.put(first,second);
            }
        }
        sc.close();
    }
}
