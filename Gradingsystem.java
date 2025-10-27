import java.util.Scanner;      // dir nato makuha ang gi input sa user


public class Gradingsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mag aask siya sa student's name
        System.out.print("Enter students name: ");
        String name = input.nextLine();

        //Mag ask siya sa student's grade
        System.out.print("Enter grade (0 - 100): ");
        double grade = input.nextDouble();

        // Determine remarks
        String remark;  
        if (grade >= 75 && grade <= 100) {
            remark = "Passed";
        } else if (grade < 75 && grade >= 0) {
            remark = "Failed";
        } else {
            remark = "Invalid grade input!";
        }

        // Display result
        System.out.println("\n--- GRADE REPORT ---");
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);

        input.close();
    }
}
