import java.util.Scanner;

public class StudentInfo {
    String name;
    int age;
    String course;

    void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentInfo s = new StudentInfo();

        System.out.print("Enter your name: ");
        s.name = input.nextLine();

        System.out.print("Enter your age: ");
        s.age = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter your course: ");
        s.course = input.nextLine();

        s.displayInfo();
    }
}


