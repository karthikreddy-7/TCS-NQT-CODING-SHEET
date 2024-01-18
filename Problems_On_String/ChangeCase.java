package Problems_On_String;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int) c;
            if (ascii >= 65 && ascii <= 91) {
                char temp = (char) (ascii + 32);
                res = res + temp;
            } else if (ascii >= 97 && ascii <= 122) {
                char temp = (char) (ascii - 32);
                res = res + temp;
            }
        }
        System.out.println("changed case string is " + res);
        sc.close();
    }
}
