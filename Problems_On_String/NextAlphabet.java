package Problems_On_String;

public class NextAlphabet {
    public static String solve(String str, int length) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int ascii = (int) (str.charAt(i));
            if (ascii == 90)
                ans.insert(i, (char) (65));

            else if (ascii == 122)
                ans.insert(i, (char) (97));

            else if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122))
                ans.insert(i, (char) (ascii + 1));
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        String str = "abcdxyz";
        int length = str.length();
        System.out.println("Original string: ");
        System.out.println(str);
        System.out.println("New string: ");
        System.out.println(solve(str, length));
    }
}
