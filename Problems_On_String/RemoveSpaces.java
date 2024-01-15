package Problems_On_String;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Word:");
        String s = sc.nextLine();
        String res = "";
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                res = res + c;
            }
        }
        System.out.println("the string with removing Spaces is " + res);
        sc.close();
    }

}
