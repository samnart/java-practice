import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();

        int choice;
        do {
            displayMenu();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Current Inventory: ");
                    inventory.displayInventory();
                    break;

                case 2:
                    updateQuantity(scanner, inventory);
                    break;

                case 3:
                    addItem(scanner, inventory);
                    break;

                case 4:
                    removeItem(scanner, inventory);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5");
            }
        } while (choice != 5);
    }

    private static void addItem(Scanner scanner, Inventory inventory) {
        System.out.println("Enter the name of the new item: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter the quantity of the new item: ");
        int quantity = scanner.nextInt();

        Item newItem = new Item(itemName, quantity);
        inventory.addItem(newItem);

        System.out.println("Item added successfully to the inventory.");
    }

    private static void updateQuantity(Scanner scanner, Inventory inventory) {
        System.out.println("Enter the name of the item to update quantity: ");
        String itemName = scanner.nextLine();
        Item itemToUpdate = findItemByName(inventory, itemName);

        if (itemToUpdate != null) {
            System.out.println("Enter the new quantity: ");
            int newQuantity = scanner.nextInt();
            itemToUpdate.setQuantity(newQuantity);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Item not found in the inventory.");
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Display Inventory");
        System.out.println("2. Update Quantity of Items");
        System.out.println("3. Add Items to Inventory");
        System.out.println("4. Remove Items from Inventory");
        System.out.println("5. Exit");
    }

    private static void removeItem(Scanner scanner, Inventory inventory) {
        System.out.println("Enter the name of the item to remove:");
        String itemName = scanner.nextLine();
        Item itemToRemove = findItemByName(inventory, itemName);

        if (itemToRemove != null) {
            inventory.removeItem(itemToRemove);
            System.out.println("Item removed successfully from the inventory.");
        } else {
            System.out.println("Item not found in the inventory.");
        }
    }

    private static Item findItemByName(Inventory inventory, String name) {
        for (Item item : inventory.getItems()) {
            if (item != null && item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}