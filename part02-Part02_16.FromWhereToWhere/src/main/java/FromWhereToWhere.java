
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int input = scanner.nextInt();
        System.out.println("Where from?");
        int input2 = scanner.nextInt();

        while (input2 <= input) {
            System.out.println(input2);
            ++input2;
        }

    }
}
