
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input != 0) {
                sum = sum + input;
                count += 1;
            } else if (input == 0) {
                break;
            }
        }
        System.out.println("Number of numbers: " + sum);
        System.out.println("Sum of the numbers: " + sum);
    }
}
