
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
         do{
          
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            else{
                list.add(input);
            }
            
        }while (true);

        System.out.println(list.get(2));
    }
}
