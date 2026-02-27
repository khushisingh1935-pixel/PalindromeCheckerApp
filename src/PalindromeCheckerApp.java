/**
 * UseCase2PalindromeCheckerApp
 * Version: 1.0
 * Description: Checks whether a hardcoded string is a palindrome
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Display the word being checked
        System.out.println("======================================");
        System.out.println("Palindrome Checker App - UC2");
        System.out.println("======================================");
        System.out.println("Word to check: " + word);

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Palindrome check using if-else
        if (word.equals(reversedWord)) {
            System.out.println("Result: The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended.");
    }
}