
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a first Number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Give a second Number : ");
        int secondNumber = scanner.nextInt();
        
        int number =firstNumber + secondNumber;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
    }
}
