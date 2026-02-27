import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC6: Queue + Stack Based Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces for uniformity
        String formattedInput = input.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char ch : formattedInput.toCharArray()) {
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}