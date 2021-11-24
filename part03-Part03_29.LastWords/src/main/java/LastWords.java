
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String sValue = scanner.nextLine();
            String[] sArr = sValue.split(" ");
            System.out.println(sArr[sArr.length-1]);
            
        
        }
    }
}
