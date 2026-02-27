import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC5: Stack-Based Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize input: remove spaces and convert to lowercase
        String formattedInput = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char ch : formattedInput.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original with reversed
        if (formattedInput.equals(reversed.toString())) {
            System.out.println("Result: \"" + input + "\" is a Palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}
