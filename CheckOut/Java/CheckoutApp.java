import java.util.Scanner;
public class CheckoutApp {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        double runningTotal = 0;
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {

            System.out.print("\nEnter Item(s) name: ");
            String name = inputCollector.nextLine();

            System.out.print("Enter price: ");
            double price = inputCollector.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = inputCollector.nextInt();
            inputCollector.nextLine(); 

            double total = price * quantity;
            runningTotal += total;

            System.out.printf("Item(s): %s | | Total: $%.2f%n", name, total);
            System.out.println("Item(s): " + name);
            System.out.println("Total: $" + total);

            System.out.print("Add another item? (yes or no): ");
             choice = inputCollector.nextLine();

            if (choice.equalsIgnoreCase("no")) {
            break;
            }
        }

        System.out.print("\nEnter discount amount: ");
        double discount = inputCollector.nextDouble();

        double valueTax = 0.075 * runningTotal;

        double finalTotal = runningTotal + valueTax - discount;

        System.out.println("\n   RECEIPT   ");
        System.out.println("Running Total: $"+ runningTotal);
        System.out.println("Discount: $"+ discount);
        System.out.println("VAT (7.5%%): "+ valueTax);
        System.out.printf("Total: $%.2f%n", finalTotal);
        

    }
}
