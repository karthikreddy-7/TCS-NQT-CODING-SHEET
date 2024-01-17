import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the N value:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        int counter = 0;
        for (int i = 2; i < n + 1; i++) {
            int old = arr[i - 1];
            int res = 0;
            int dummy = i;
            // counter++;
            while (dummy > 0) {
                res += old;
                dummy--;
                counter++;
            }
            arr[i] = res;
        }
        System.out.println("the factorial value is  " + arr[n] + " and calls made to acheive this is " + counter);
        sc.close();
    }
}
