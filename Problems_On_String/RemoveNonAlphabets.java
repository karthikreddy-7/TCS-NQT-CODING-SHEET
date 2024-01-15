package Problems_On_String;

import java.util.Scanner;

public class RemoveNonAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Word:");
        String s = sc.nextLine();
        String res = "";
        for (char c : s.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                res = res + c;
            }
        }
        System.out.println("the string with removing non alphabets is " + res);
        sc.close();
    }

}
