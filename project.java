
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double subtotal = 0.0;
    int choice;

    do {
      System.out.println("\n--- American Muscle Grill ---");
      System.out.println("1. Mustang Mac N' Cheese - $8.00");
      System.out.println("2. Firebird Falafels - $5.00");
      System.out.println("3. Challenger Chili Dogs - $10.00");
      System.out.println("4. Charger Cheeseburger - $7.00");
      System.out.println("5. Checkout");

      System.out.print("Choose an Item: ");
      choice = scanner.nextInt();

      if (choice == 5) {
        break;
      }

      double price = 0.0;
      String itemName = "";

      switch (choice) {
        case 1:
          itemName = "Mustang Mac N' Cheese";
          price = 8.00;
          break;

        case 2:
          itemName = "Firebird Falafels";
          price = 5.00;
          break;

        case 3:
          itemName = "Challenger Chili Dogs";
          price = 10.00;
          break;

        case 4:
          itemName = "Charger Cheeseburger";
          price = 7.00;
          break;

        default:
          System.out.println("Invalid menu choice. Try again.");
          continue;
      }

      System.out.print("Quantity: ");
      int quantity = scanner.nextInt();

      while (quantity <= 0) {
        System.out.println("Quantity must be greater than 0.");
        System.out.print("Enter Quantity again: ");
        quantity = scanner.nextInt();
      }

      double itemTotal = price * quantity;
      subtotal += itemTotal;

      System.out.printf("%d x %s = $%.2f%n",
                        quantity, itemName, itemTotal);

    } while (choice != 5);

    System.out.println("\n--- Your Receipt ---");
    System.out.printf("Subtotal: $%.2f%n", subtotal);
    System.out.println("Thank you for visiting American Muscle Grill!");

    scanner.close();
  }
}
