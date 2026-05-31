import java.util.Scanner;
public class CheckoutApp {

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        double subtotal = 0;
        while (true) {

            System.out.print("\nEnter product name: ");
            String name = inputCollector.nextLine();

            System.out.print("Enter price: ");
            double price = inputCollector.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = inputCollector.nextInt();
            inputCollector.nextLine(); 

            double total = price * quantity;
            subtotal += total;

            System.out.printf("Added: %s | Total: %.2f%n", name, total);

            System.out.print("Add another item? (yes/no): ");
            String choice = inputCollector.nextLine();

            if (choice.equalsIgnoreCase("no")) break;
        }

        System.out.print("\nEnter discount amount: ");
        double discount = inputCollector.nextDouble();

        double vat = 0.075 * subtotal;

        double finalTotal = subtotal + vat - discount;

        System.out.println("\n CHECKOUT SUMMARY");
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
        System.out.printf("Total to pay: %.2f%n", finalTotal);
        

    }
}
