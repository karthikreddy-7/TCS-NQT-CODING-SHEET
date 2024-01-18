package Problems_On_String;

public class WordWithRepeatedLetters {
    static void HighestRepeatedLetters(String str) {
        int len = str.length();

        int maximumword = 0;

        int curr_maximumword = 0;

        String result = "";

        for (int left = 0; left < len;) {

            int right = left + 1;
            while (right < len && str.charAt(right) != ' ') {
                right++;
            }

            int frequency[] = new int[26];
            curr_maximumword = 0;

            for (int index = left; index < right; index++) {
                frequency[str.charAt(index) - 'a']++;
            }
            for (int index = 0; index < 26; index++) {
                if (frequency[index] > 1) {
                    curr_maximumword++;
                }
            }

            if (curr_maximumword > maximumword) {
                maximumword = curr_maximumword;
                result = "";
                for (int j = left; j < right; j++)
                    result += str.charAt(j);

            }

            left = right + 1;
        }

        if (result.equals("")) {
            System.out.println("-1");
        } else {

            System.out.print("Word with highest number of repeated letters : ");
            System.out.println(result);
        }
    }

    public static void main(String args[]) {

        String str = "abcdefg google microsoft";
        HighestRepeatedLetters(str);

    }
}
