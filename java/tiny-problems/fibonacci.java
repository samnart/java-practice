import java.util.Scanner;

public class fibonacci {

    public static void printFibonacci(int N) {
        int prev = 0;
        int current = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(prev + " ");
            int next = prev + current;
            prev = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number fo Fibonacci numbers to print: ");
            int N = scanner.nextInt();

            printFibonacci(N);
        }
    }
}