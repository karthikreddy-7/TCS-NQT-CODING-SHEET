package Problems_On_String;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String text = sc.nextLine();
        System.out.println("enter the pattern");
        String pattern = sc.nextLine();

        int foundIdx = text.indexOf(pattern);

        System.out.println("The substring starts from the index: " + foundIdx);
        sc.close();
    }

}
