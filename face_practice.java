import java.util.Scanner;

public class face_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int res = fac(n);
        int digit = res % 10;
        if (digit == 0) {
            while (res > 0) {
                int lastdigit = res % 10;
                if (lastdigit != 0) {
                    digit = lastdigit;
                    break;
                }
                res = res / 10;
            }
        }
        System.out.println("output is " + digit);
        sc.close();
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fac(n - 1);
    }

}
