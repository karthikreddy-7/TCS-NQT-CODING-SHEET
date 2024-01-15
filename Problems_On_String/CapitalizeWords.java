package Problems_On_String;

import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = capitalizeWords(input);
        System.out.println("Result: " + result);
        scanner.close();
    }

    private static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.length() > 1) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar).append(" ");
            } else {
                result.append(Character.toUpperCase(word.charAt(0))).append(" ");
            }
        }
        return result.toString().trim();
    }
}
