/**
 * UseCase3PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using String reverse logic
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        System.out.println("======================================");
        System.out.println("Palindrome Checker App - UC3");
        System.out.println("======================================");
        System.out.println("Original String: " + original);

        // Reverse the string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended.");
    }
}