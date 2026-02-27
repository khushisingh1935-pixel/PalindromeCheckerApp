/**
 * UseCase4PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using Character Array (char[])
 */

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "racecar";

        System.out.println("======================================");
        System.out.println("Palindrome Checker App - UC4");
        System.out.println("======================================");
        System.out.println("Original String: " + original);

        // Convert String to Character Array
        char[] characters = original.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("======================================");
        System.out.println("Program Ended.");
    }
}