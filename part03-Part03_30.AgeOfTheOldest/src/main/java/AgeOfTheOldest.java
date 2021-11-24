
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =0;
        while(scanner.hasNext()){
            String sValue = scanner.nextLine();
            String[] sArr = sValue.split(",");
            age=(Integer.valueOf(sArr[1]) >age)?Integer.valueOf(sArr[1]):age;
        }
        System.out.println("Age of the oldest:" + age);
    }
}
