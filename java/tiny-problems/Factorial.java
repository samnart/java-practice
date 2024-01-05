// A Factorial.java class that takes a number from input and returns the factorial of the number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();

            int result = 1;

            while (number > 1) {
                result *= number;
                number--;
            }
            // return result;
            System.out.println(result);
        }
    }
    
}