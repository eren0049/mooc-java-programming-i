
import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = scanner.nextLine(); 
        int i = 1;
        while (i<=3){
            i+=1;
            System.out.println(message);
        }
    }
}
