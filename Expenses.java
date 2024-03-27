import java.util.Scanner;

public class CalculateExpenses {
    public static double calculateExpenses(int quantity, double pricePerItem) {
        double totalCost = quantity * pricePerItem;
        double discount = 0.0;
        
        if (quantity > 50) {
            discount = 0.1 * totalCost;
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05 * totalCost;
        }
        
        double finalCost = totalCost - discount;
        return finalCost;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();
        
        double totalExpenses = calculateExpenses(quantity, pricePerItem);
        System.out.printf("Total expenses after discount: $%.2f\n", totalExpenses);
        
        scanner.close();
    }
}
