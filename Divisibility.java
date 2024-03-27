import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is divisible by both 7 and 13
        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println(number + " is divisible by both 7 and 13.");
            
            // Calculate quotient and remainder when divided by 7
            int quotient7 = number / 7;
            int remainder7 = number % 7;
            System.
