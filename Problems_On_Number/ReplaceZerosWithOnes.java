package Problems_On_Number;

import java.util.Scanner;

public class ReplaceZerosWithOnes {
    static int replaceZerosWithOnes(int num) {
        if (num == 0) {
            return 1;
        }
        int ans = 0, tmp = 1;
        while (num > 0) {
            int d = num % 10;
            if (d == 0) {
                d = 1;
            }
            ans = d * tmp + ans;
            num = num / 10;
            tmp = tmp * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int result = replaceZerosWithOnes(n);
        System.out.println("After replacing zeros with ones " + n + " becomes " + result);
        sc.close();
    }

}
