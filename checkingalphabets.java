import java.util.Scanner;

public class checkingalphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int[] alphabets = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabets[index]++;
            }
        }
        String res = "";
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] == 0) {
                char c = (char) ('a' + i);
                res = res + c + " ";
            }
        }
        if (!res.equals("")) {
            System.out.println("The alphabets which are not present are: " + res);
        } else {
            System.out.println("All alphabets are present in the string.");
        }
        sc.close();
    }

}
