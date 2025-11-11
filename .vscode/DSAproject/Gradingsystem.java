import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student name: ");
        String name = sc.nextLine();
        System.out.print("Grade (0-100): ");
        double grade = sc.nextDouble();
        
        System.out.println("\n--- GRADE REPORT ---");
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + 
            (grade >= 75 && grade <= 100 ? "Passed" : 
            grade >= 0 ? "Failed" : "Invalid grade input!"));

        sc.close();
    }
}
