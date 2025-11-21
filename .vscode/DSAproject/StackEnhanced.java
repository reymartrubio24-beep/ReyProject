import java.util.Stack;
import java.util.Scanner;

public class StackEnhanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a word or expression: ");
        String text = input.nextLine();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("\n=== STACK RESULT ===");
        System.out.println("Original : " + text);
        System.out.println("Reversed : " + reversed);
        System.out.println("Characters Processed: " + text.length());
    }
}
