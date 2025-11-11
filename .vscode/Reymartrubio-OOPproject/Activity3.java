import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] emails = new String[3];
        String[] usernames = new String[3];
        String[] passwords = new String[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("\nUser " + i + ":");
            System.out.print("Enter Email: ");
            emails[i] = input.nextLine();

            System.out.print("Enter Username: ");
            usernames[i] = input.nextLine();

            System.out.print("Enter Password: ");
            passwords[i] = input.nextLine();
        }

        System.out.print("\nEnter index (0–2) to display credentials: ");
        int index = input.nextInt();

        System.out.println("\nIndex: " + index);
        System.out.println("Email: " + emails[index]);
        System.out.println("Username: " + usernames[index]);
        System.out.println("Password: " + passwords[index]);
    }
}
