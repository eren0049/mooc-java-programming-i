
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            Double value = Double.valueOf(scanner.nextLine());
            if (value == -1) {
                break;
            }
            list.add(value);
        }
        double dTemp = 0;
        for (double dValue : list) {
            dTemp = dTemp + dValue;
        }

        System.out.println("Average: " + (dTemp / list.size()));
    }
}
