package Problems_On_String;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args)
    {
        String inpString , revString = "";

        //Get the Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check for Palindrome :");
        inpString = sc.nextLine();

        //Reverse the Input string
        for(int i = inpString.length() -1 ; i >= 0 ; i--)
        {
            revString = revString + inpString.charAt(i);
        }

        //Check if the Input string is equal to the Reversed string
        if(inpString.equals(revString))
        {
            System.out.println("The given String is a Palindrome");
        }
        else
        {
            System.out.println("The given String is not a Palindrome");
        }

        sc.close();
    }
}
