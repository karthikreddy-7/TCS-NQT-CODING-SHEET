package Previously_Asked_Coding_Question;

import java.util.Scanner;

/*
 *  A chocolate factory is packing chocolates into the packets. The chocolate packets here 
 * represent an array of N number of integer values. The task is to find the empty packets(0) of 
 * chocolate and push it to the end of the conveyor belt(array). Click here to see solution
Example 1 : N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
 */
public class ChocolateFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // we can replace the 0 elements of the array with the next element
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        for (int i = count + 1; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
