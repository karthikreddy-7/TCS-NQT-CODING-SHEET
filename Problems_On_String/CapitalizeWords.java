package Problems_On_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "capiTalIze tHe titLe";
       String result = capitalizeTitle(input);
        System.out.println(result);
//





        scanner.close();
    }


     // Test Cases;
    /**
     Input: title = "capiTalIze tHe titLe"
     Output: "Capitalize The Title"
     Explanation:
     Since all the words have a length of at least 3,
     the first letter of each word is uppercase, and the remaining letters are lowercase.
     Example 2:

     Input: title = "First leTTeR of EACH Word"
     Output: "First Letter of Each Word"
     Explanation:
     The word "of" has length 2, so it is all lowercase.
     The remaining words have a length of at least 3,
     so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
     */

    //   https://leetcode.com/problems/capitalize-the-title/

    public static String  capitalizeTitle(String title) {

        int ans[]=getEmptySpaceIndex(title);

        char[] c=title.toCharArray();

        for (int i = 0; i < c.length; i++) {
            c[i]=Character.toLowerCase(c[i]);
        }
         c[0]=Character.toUpperCase(c[0]);
//        c[ans[1]]=Character.toUpperCase(c[ans[0]]);
//        c[ans[2]]=Character.toUpperCase(c[ans[0]]);
//        c[ans[0]]=Character.toUpperCase(c[ans[0]]);

        for (int i = 0; i < ans.length; i++) {
            c[ans[i]]=Character.toUpperCase(c[ans[i]]);

        }

        return "";

    }
    public static int[]  getEmptySpaceIndex(String input){
        ArrayList<Integer>  list=new ArrayList<>();
        char[] c=input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]==' '){
                list.add(i+1);// i get the after space values
            }

        }
        int [] arr=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]=list.get(i);

        }
        return arr;
    }

}
