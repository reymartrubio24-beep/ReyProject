import java.util.Scanner;

public class Votingsystem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] candidates = {"Alice", "Bob", "Charlie", "Rubio"};
        int[] votes = {0, 0, 0, 0};

        System.out.println("=== SIMPLE VOTING SYSTEM ===");
        System.out.println("Candidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }

        System.out.print("\nEnter number of voters: ");
        int voters = input.nextInt();
        
        for (int i = 1; i <= voters; i++) {
            System.out.print("Voter " + i + ", enter your vote (1-4): ");
            int choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {
                votes[choice - 1]++;
            } else {
                System.out.println("Invalid vote! Skipped.");
            }
        }

        System.out.println("\n=== VOTING RESULTS ===");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + ": " + votes[i] + " votes");
        }
        
        
        int maxVotes = votes[0];
        String winner = candidates[0];
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes!");
        input.close();
    }
}
