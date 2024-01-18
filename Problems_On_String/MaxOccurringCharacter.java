package Problems_On_String;

import java.util.Arrays;

public class MaxOccurringCharacter {
    static char maxOccurringChar(String str) {
        char ans = str.charAt(0);
        int i, curr_freq = 0, max_freq = 0, n = str.length();
        for (i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                curr_freq++;
            } else {
                if (max_freq < curr_freq) {
                    max_freq = curr_freq;
                    ans = str.charAt(i - 1);
                }
                curr_freq = 0;
            }
        }
        if (max_freq < curr_freq) {
            max_freq = curr_freq;
            ans = str.charAt(i - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "takeuforward";
        // convert to character array
        char charArr[] = str.toCharArray();
        // sort the character array
        Arrays.sort(charArr);
        // sorted character array converted back to string
        str = new String(charArr);
        System.out.println("Maximum Occurring Character is " + maxOccurringChar(str));
    }
}
