
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String sUName = scanner.nextLine();
        System.out.println("Enter password:");
        String sPassword = scanner.nextLine();
        System.out.println(((sUName.equals("alex") & sPassword.equals("sunshine"))
                || (sUName.equals("emma") & sPassword.equals("haskell")))
                ? "You have successfully logged in!" : "Incorrect username or password!");
    }
}
