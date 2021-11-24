
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum += input;
                count += 1;
                if ((input % 2) == 0) {
                    evenCounter = evenCounter + 1;
                }
                if ((input % 2) == 1) {
                    oddCounter = oddCounter + 1;
                }
            }

        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double)sum/(double)count);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
}
