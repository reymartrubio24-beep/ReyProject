//✓ OUTPUT-NOVEMEBER 20, 2025
import java.util.Scanner;

public class GradeAverageProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GRADE AVERAGE PROGRAM ===");
        

        System.out.print("Enter grade 1: ");
        double grade1 = scanner.nextDouble();
        
        System.out.print("Enter grade 2: ");
        double grade2 = scanner.nextDouble();
        
        System.out.print("Enter grade 3: ");
        double grade3 = scanner.nextDouble();
        
        System.out.print("Enter grade 4: ");
        double grade4 = scanner.nextDouble();
        
        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        
        System.out.printf("\nAverage: %.2f\n", average);
        

        if (average > 100) {
            System.out.println("Invalid grade");
        } else if (average >= 98 && average <= 100) {
            System.out.println("With highest honors");
        } else if (average >= 95 && average <= 97.99) {
            System.out.println("With high honors");
        } else if (average >= 90 && average <= 94.99) {
            System.out.println("With honors");
        } else if (average >= 75 && average <= 89.99) {
            System.out.println("Passed");
        } else if (average < 75) {
            System.out.println("Failed");
        }
        
        scanner.close();
    }
}