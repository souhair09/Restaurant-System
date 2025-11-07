import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Return to Home Page");
            System.out.println("2 - Logout");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice) {
                case 1:
                    System.out.println("Returning to the Home Page...");
                    AccueilRestaurant.main(null); 
                    break;
                case 2:
                    System.out.println("You have been logged out. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 2);

        scanner.close();
    }
}
