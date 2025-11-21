import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEnhanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> tasks = new LinkedList<>();

        System.out.println("Enter tasks (type STOP to finish):");
        while (true) {
            System.out.print("Task: ");
            String task = input.nextLine();
            if (task.equalsIgnoreCase("STOP")) break;
            tasks.add(task);
        }

        System.out.println("\n=== QUEUE RESULT ===");
        while (!tasks.isEmpty()) {
            System.out.println("Queue Size: " + tasks.size());
            System.out.println("Processing: " + tasks.poll());
        }

        System.out.println("All tasks completed!");
    }
}
