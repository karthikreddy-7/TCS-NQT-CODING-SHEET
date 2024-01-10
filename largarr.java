import java.util.Scanner;

public class largarr {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The smallest number in the given array is "+max);


    }
}
