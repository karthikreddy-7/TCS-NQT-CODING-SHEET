package Previously_Asked_Coding_Question;

import java.util.Scanner;

/*
 * Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is
to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered
valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the
input string.
● (*>#): positive integer
● (#>*): negative integer
● (#=*): 0

 */
public class prev7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count1 = 0, count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')
                count1++;
            else if (str.charAt(i) == '#')
                count2++;
        }
        System.out.println(count1 - count2);

    }
}
