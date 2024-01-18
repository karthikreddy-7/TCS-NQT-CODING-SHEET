package Problems_On_String;

public class RemoveCharacters {
    public static String solve(String str1, String str2) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            int flag = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    flag = 1;
                }
            }

            if (flag != 1)
                ans.append(str1.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        String str1 = "abcdef";
        String str2 = "cefz";

        System.out.println("Final string 1:");
        System.out.println(solve(str1, str2));
    }
}
