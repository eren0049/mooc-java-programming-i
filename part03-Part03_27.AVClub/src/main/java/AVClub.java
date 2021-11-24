
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (scanner.hasNext()) {
             String sValue = scanner.nextLine();
            String[] sArr = sValue.split(" ");
            for (String s : sArr) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
        }
    }
}
