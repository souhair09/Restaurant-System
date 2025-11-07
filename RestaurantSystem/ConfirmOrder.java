import java.util.ArrayList;
import java.util.Scanner;

public class ConfirmOrder {
    static Scanner input = new Scanner(System.in);

    public static void confirmOrder() {
        ArrayList<String> cart = QuantitySelection.cart;
        double totalPrice = QuantitySelection.totalPrice;

        System.out.println("\n===== Order Confirmation =====");

        if (cart.isEmpty()) {
            System.out.println("No items in your cart!");
            return;
        }

        System.out.println("Your order:");
        for (String item : cart) {
            System.out.println("- " + item);
        }

        System.out.println("----------------------------");
        System.out.println("Total: " + totalPrice + " DA");
        System.out.println("----------------------------");

        System.out.print("Do you want to confirm and print receipt? (yes/no): ");
        String confirm = input.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            printReceipt(cart, totalPrice);
        } else {
            System.out.println("Order not confirmed, returning to main menu...");
        }
    }

    public static void printReceipt(ArrayList<String> cart, double totalPrice) {
        System.out.println("\n=========== Receipt ===========");
        for (String item : cart) {
            System.out.println(item);
        }
        System.out.println("----------------------------");
        System.out.println("Total: " + totalPrice + " DA");
        System.out.println("Thank you for your order!");
        System.out.println("============================");
    }
}
