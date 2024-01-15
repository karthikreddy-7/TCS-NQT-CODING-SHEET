package Problems_On_Number;

public class QuadraticEquationRoots {
    static void Roots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));

        if (d > 0) {
            System.out.println("Roots are real and different ");

            double root1 = (double) (-b + sqrt_val) / (2 * a);
            double root2 = (double) (-b - sqrt_val) / (2 * a);
            System.out.println(root1 + "\n" + root2);
        } else if (d == 0) {
            System.out.println("Roots are real and same ");
            double root1 = -(double) b / (2 * a);
            double root2 = -(double) b / (2 * a);
            System.out.println(root1 + "\n" + root2);
        } else // d < 0
        {
            System.out.println("Roots are complex ");

            System.out.println(-(double) b / (2 * a) + " + i" + sqrt_val + "\n" +
                    -(double) b / (2 * a) + " - i" + sqrt_val);
        }
    }

    public static void main(String args[]) {
        int a = 1, b = -3, c = -10;

        Roots(a, b, c);
    }
}
