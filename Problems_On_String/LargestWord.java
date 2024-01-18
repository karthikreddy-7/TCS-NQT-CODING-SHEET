package Problems_On_String;

public class LargestWord {
    static String maxLength(String str) {
        int len = str.length();
        int i = 0, j = 0;
        String maxWord = "";
        int max_length = 0, max_start = 0;

        while (j <= len) {
            if (j < len && str.charAt(j) != ' ')
                j++;

            else {
                int curr_length = j - i;

                if (curr_length > max_length) {
                    max_length = curr_length;
                    max_start = i;
                }
                j++;
                i = j;
            }
        }

        maxWord = str.substring(max_start, max_length);
        return maxWord;
    }

    public static void main(String[] args) {
        String str = "Google Docs";

        System.out.print("Largest Word is: " + maxLength(str));

    }
}
