package Previously_Asked_Coding_Question;

/*
 * Given a number N, your task is to calculate and print the sum of the table of N.
Sample test case 1:
Input:
N = 10
ouput: 55 * 10 = 550
550
Sample test case 2:
Input:
N = 68 N * (1-10) -> 55 * 68 = 3740
ouput:
3740
 */
public class prev2 {
    public static void main(String[] args) {
        int N = 10;
        int sum = N;
        for (int i = 2; i <= N; i++) {
            sum += N * i;
        }
        System.out.println("sum of the table is " + sum);
    }
}
