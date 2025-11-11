import java.util.Scanner;

public class Votingsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] candidates = {"Alice", "Bob", "Charlie", "Rubio"};
        int[] votes = new int[candidates.length];

        System.out.println("=== SIMPLE VOTING SYSTEM ===");
        System.out.println("Candidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }

        System.out.print("\nEnter number of voters: ");
        int voters = input.nextInt();


        boolean[] hasVoted = new boolean[voters + 1];

        for (int i = 1; i <= voters; i++) {
            if (hasVoted[i]) {
                System.out.println("Voter " + i + " has already voted!");
                continue;
            }

            System.out.print("Voter " + i + ", enter your vote (1-" + candidates.length + "): ");
            int choice = input.nextInt();

            if (choice >= 1 && choice <= candidates.length) {
                votes[choice - 1]++;
                hasVoted[i] = true;
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
        boolean tie = false;

        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
                tie = false;
            } else if (votes[i] == maxVotes) {
                tie = true;
            }
        }

        if (tie) {
            System.out.println("\nResult: It's a tie!");
        } else {
            System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes!");
        }

        input.close();
    }
}
