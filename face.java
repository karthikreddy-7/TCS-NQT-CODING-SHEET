import java.util.Scanner;

public class face {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        int sum = 0;
        int counter = 1;
        char prev = s.charAt(0);
        System.out.print("even consective characters are  ");
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                counter++;
            } else {
                if (counter % 2 == 0) {
                    sum += counter;
                    System.out.print(prev + " ");
                }
                prev = s.charAt(i);
                counter = 1;
            }
        }
        if (counter > 1 && counter % 2 == 0) {
            System.out.print(prev + " ");
            sum += counter;
        }
        System.out.println();
        System.out.println("the sum of even consecutive characters of " + s + " is " + sum);
        sc.close();
    }

}
