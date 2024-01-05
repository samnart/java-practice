import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String input) {

        String phraseRegex = input.replaceAll("[^a-z0-9]", "");
            
        int start = 0;
        int end = phraseRegex.length() - 1;

        while (start < end) {
            if (phraseRegex.charAt(start) != phraseRegex.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }



    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String userInput = scanner.nextLine();

            boolean result = isPalindrome(userInput);

            if (result) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
}