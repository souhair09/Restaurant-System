import java.util.ArrayList;
import java.util.Scanner;

public class QuantitySelection {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> cart = new ArrayList<>();
    static double totalPrice = 0.0;

    public static void selectQuantityAndExtras(String selectedItem, double itemPrice) {
        System.out.println("===== Quantity and Extras Selection =====");
        System.out.println("Selected item: " + selectedItem);
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine(); 

        System.out.print("Do you want to add extras? (yes/no): ");
        String addChoice = input.nextLine();
        String addition = "No extras";
        double additionPrice = 0.0;

        if (addChoice.equalsIgnoreCase("yes")) {
            System.out.println("Available extras:");
            System.out.println("1. Mayonnaise (+20 DA)");
            System.out.println("2. Harissa (+15 DA)");
            System.out.println("3. Extra Cheese (+30 DA)");
            System.out.print("Your choice (enter number): ");
            int addOption = input.nextInt();
            input.nextLine();

            switch (addOption) {
                case 1:
                    addition = "Mayonnaise";
                    additionPrice = 20;
                    break;
                case 2:
                    addition = "Harissa";
                    additionPrice = 15;
                    break;
                case 3:
                    addition = "Extra Cheese";
                    additionPrice = 30;
                    break;
                default:
                    System.out.println("Invalid option, no extras added.");
                    addition = "No extras";
                    additionPrice = 0.0;
            }
        }

        double total = (itemPrice + additionPrice) * quantity;
        totalPrice += total;

        String orderLine = selectedItem + " ×" + quantity + " (" + addition + ") - " + total + " DA";
        cart.add(orderLine);

        System.out.println("----------------------------------");
        System.out.println("Item added to cart!");
        System.out.println("Current total: " + totalPrice + " DA");
        System.out.println("----------------------------------");
    }

    public static void showCart() {
        System.out.println("===== Shopping Cart =====");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (String item : cart) {
                System.out.println(item);
            }
            System.out.println("Total price: " + totalPrice + " DA");
        }
    }
}
