
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String sValue = scanner.nextLine();
        System.out.println((!sValue.equals("true")) ? "Try again!" : "You got it right!");
    }
}
