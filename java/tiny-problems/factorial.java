import java.util.*;

public class factorial {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }

    }
}