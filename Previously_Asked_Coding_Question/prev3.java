package Previously_Asked_Coding_Question;

import java.util.Scanner;

/*
 * Given two integers, a and b, your task is to determine the sum of the cubes of
all numbers in the range from a to b.
sample test case
a = 4
b = 9
ouput: 1989
 */
public class prev3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        for (int i = a; i <= b; i++) {
            total += i * i * i;
        }
        System.out.println(total);

    }
}
