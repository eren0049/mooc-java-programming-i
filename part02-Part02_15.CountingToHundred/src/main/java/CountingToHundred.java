
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Give a Number");
        int input = scanner.nextInt();
        
        for(int i=100;input <=i;input++){
            System.out.println(input);
        
        }
    }
}
