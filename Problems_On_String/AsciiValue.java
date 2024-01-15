package Problems_On_String;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character:");
        char c = sc.next().charAt(0);
        int ascii = c;
        System.out.println("the ascii value of the character is " + ascii);
        sc.close();
    }

}
