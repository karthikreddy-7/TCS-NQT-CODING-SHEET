import java.util.Scanner;
public class smallarr {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest number in the given array is "+min);


    }
    
}
