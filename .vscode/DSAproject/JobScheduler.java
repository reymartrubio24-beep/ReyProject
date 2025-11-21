import java.util.PriorityQueue;
import java.util.Scanner;

public class JobScheduler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("Enter job priorities (type -1 to stop):");
        while (true) {
            System.out.print("Priority: ");
            int p = input.nextInt();
            if (p == -1) break;
            pq.add(p);
        }

        System.out.println("\n=== PRIORITY QUEUE RESULT ===");
        while (!pq.isEmpty()) {
            System.out.println("Processing job with priority: " + pq.poll());
        }
    }
}
