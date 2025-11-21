//✓ OUTPUT-NOVEMEBER 22, 2025
import java.util.Scanner;

public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "password123";
        
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean accessGranted = false;
        
        System.out.println("=== SIMPLE LOGIN AUTHENTICATION ===");
        
        while (attempts < MAX_ATTEMPTS && !accessGranted) {
            System.out.print("\nEnter username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            
            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("Access Granted");
                accessGranted = true;
            } else {
                attempts++;
                System.out.println("Access Denied");
                
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("You have " + (MAX_ATTEMPTS - attempts) + " attempt(s) remaining");
                } else {
                    System.out.println("Account locked! Too many failed attempts.");
                }
            }
        }
        
        scanner.close();
    }
}