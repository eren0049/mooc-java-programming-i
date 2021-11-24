
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String sValue = scanner.nextLine();
            if (sValue.isEmpty()) {
                break;
            } else {
                String[] split = sValue.split(" ");
                for (String s : split) {
                    System.out.println(s);
                }
            }
        }
    }
}
