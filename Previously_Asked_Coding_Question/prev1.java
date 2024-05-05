package Previously_Asked_Coding_Question;
/*
 * You are given an array of integers, arr,
and an integer k. Your task is to find and print the maximum number in
each contiguous window of size k.
Sample test case 1:
Input:
arr = [1, 3, -1, -3, 5, 3, 6, 7] k=3
Output:
[3, 3, 5, 5, 6, 7]
 */

public class prev1 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] arr1 = new int[arr.length - k + 1];
        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr1[i] = max;
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}