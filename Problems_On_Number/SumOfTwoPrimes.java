package Problems_On_Number;

public class SumOfTwoPrimes {
    static boolean prime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isPrime(int n) {

        if (prime(n) && prime(n - 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int n = 19;

        if (isPrime(n)) {
            System.out.println("Yes");
        } else if (isPrime(n)) {
            System.out.println("No");
        }
    }
}
