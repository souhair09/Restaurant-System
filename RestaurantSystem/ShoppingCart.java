import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> cart = QuantitySelection.cart;
    static double totalPrice = QuantitySelection.totalPrice;

    public static void showCart() {
        System.out.println("\n===== Shopping Cart =====");

        if (cart.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }

        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }

        System.out.println("------------------------------");
        System.out.println("Total price: " + totalPrice + " DA");
        System.out.println("------------------------------");

        System.out.println("1. Remove an item");
        System.out.println("2. Go back to main menu");
        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                removeItem();
                break;
            case 2:
                System.out.println("Returning to main menu...");
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    public static void removeItem() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty, nothing to remove!");
            return;
        }

        System.out.print("Enter the number of the item to remove: ");
        int index = input.nextInt();

        if (index >= 1 && index <= cart.size()) {
            String removedItem = cart.remove(index - 1);
            System.out.println("Removed: " + removedItem);
        } else {
            System.out.println("Invalid item number!");
        }
    }
}
