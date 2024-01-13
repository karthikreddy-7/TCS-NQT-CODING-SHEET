package Previously_Asked_Coding_Question;

import java.util.Scanner;

/*
 * Joseph is learning digital logic subject which will be for his next semester. 
 * He usually tries to solve unit assignment problems before the lecture. 
 * Today he got one tricky question. The problem statement is “A positive integer has been 
 * given as an input. Convert decimal value to binary representation. 
 * Toggle all bits of it after the most significant bit including the most significant bit. 
 * Print the positive integer value after toggling all bits”.
 */
public class Binary_Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        String s = "";
        while (n > 0) {
            int temp = (n & 1);
            s = temp + s;
            n = n >> 1;
        }
        int pow = 0;
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                res += Math.pow(2, pow);
            }
            pow++;
        }
        System.out.println(res);
        sc.close();
    }

}
