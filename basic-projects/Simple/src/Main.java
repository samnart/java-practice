import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you first number: ");
        int A = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int B = scanner.nextInt();

        int result = A + B;
        System.out.println("The result for " + A + " plus " + B + " is equal to: " + result);

        scanner.close();
    }
}