package Problems_On_String;

import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String text = sc.nextLine();
        System.out.println("enter the 2nd string");
        String pattern = sc.nextLine();
        System.out.println("The concatenated string is : " + (text + pattern));
        sc.close();
    }

}
