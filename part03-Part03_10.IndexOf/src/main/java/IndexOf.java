
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        int i = scanner.nextInt();
        for (int i1 = 0; i1 < list.size(); i1++) {
            if (list.get(i1) == i) {
                System.out.println(i + "is at index" + i1);
            }
        }

        // implement here finding the indices of a number
    }
}
