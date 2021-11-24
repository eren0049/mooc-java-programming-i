
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name ="";
        while(scanner.hasNext()){
            String sValue = scanner.nextLine();
            String[] sArr = sValue.split(",");
            name = (Integer.valueOf(sArr[1])>age)?sArr[0]:name;
            age= (Integer.valueOf(sArr[1])>age)?Integer.valueOf(sArr[1]):age;
        }
        System.out.println("Name of the oldest:" + name);
    }
}
