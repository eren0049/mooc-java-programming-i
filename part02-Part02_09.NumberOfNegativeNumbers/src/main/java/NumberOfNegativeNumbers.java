
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input != 0) {
                count +=1;
            } elseif (input == 0) {
                break;
            }
        }
        System.out.println ("Sum of the numbers:  " + count);
    }
}
