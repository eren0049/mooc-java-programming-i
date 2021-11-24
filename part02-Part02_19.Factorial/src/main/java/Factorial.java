
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int input = scanner.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= input; i++) {
            if (input == 0) {
                System.out.println("Factorial: 1");
            } else if (input > 0) {
                faktorial *= i;
            }
        }
        if (input > 0) {
            System.out.println("Factorial: " + faktorial);
        }
    }
}
