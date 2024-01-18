package Problems_On_String;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        int n = str.length();
        int spaces = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ')
                spaces = spaces + 1;
        }

        System.out.print("Number of words are ");
        System.out.print(spaces + 1);
        sc.close();
    }
}
