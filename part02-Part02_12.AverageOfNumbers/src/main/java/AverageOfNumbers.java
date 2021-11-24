
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input != 0) {
                sum = sum + input;
                count++;
            } else if (input == 0) {
                break;
            }
        }
        System.out.println("Average of the numbers: " + sum/count);
    }
}
