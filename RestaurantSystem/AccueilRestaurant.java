import java.util.Scanner;

public class AccueilRestaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==================================");
            System.out.println("Welcome to Pleasure Restaurant");
            System.out.println("==================================");
            System.out.println("1. Show food menu");
            System.out.println("2. Quantity and extras");
            System.out.println("3. Shopping cart");
            System.out.println("4. Confirm and track order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    MenuRestaurant.showMenu();
                    break;
                case 2:
                    QuantitySelection.selectQuantityAndExtras("Pizza", 700);
                    break;
                case 3:
                    ShoppingCart.showCart();
                    break;
                case 4:
                    ConfirmOrder.confirmOrder();
                    break;
                case 5:
                    System.out.println("Redirecting to the final menu...");
                    Main.main(null); // Call the final menu with Return Home / Logout
                    return; // Exit current main to avoid duplicate loops
                default:
                    System.out.println("Invalid option!");
            }
        } while (true); // Keep looping until user chooses logout in Main.java
    }
}
