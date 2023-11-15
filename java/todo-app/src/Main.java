import java.util.Scanner;
import java.util.ArrayList;

public class Main {

//    initialize both the scanner and arraylist
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        printMenu();
        while (true) {
            int choice = getChoice();
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTask();
                    break;
                case 4:
                    System.out.println("Goodbye for now, see you later!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again.");

            }
        }
    }
//    print the main menu of the to-do app
    private static void printMenu() {
        System.out.println("--- To-Do App ---");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. View tasks");
        System.out.println("4. Exit");
    }
//    get the user choice
    private static int getChoice() {
        return scanner.nextInt();
    }

//    add tasks to the app
    private static void addTask() {
        
    }

//    remove tasks from the app
    private static void removeTask() {
//        if ();
    }

//    view tasks when an item is added
    private static void viewTask() {

    }
//    exit

}