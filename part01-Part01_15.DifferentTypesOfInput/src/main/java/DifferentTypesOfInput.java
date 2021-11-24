
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String value1 = scanner.nextLine();
        System.out.println("Give an integer:");
        int value2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double value3 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean value4 = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string "+ value1);
        System.out.println("You gave the integer " + value2);
        System.out.println("You gave the double "+ value3);
        System.out.println("You gave the boolean " + value4);
        System.out.println("Give a string:");
        
        String value5 = scanner.nextLine();
        System.out.println("Give an integer:");
        int value6 = scanner.nextInt();
        System.out.println("Give a double:");
        double value7 = scanner.nextDouble();
        System.out.println("Give a boolean:");
        boolean value8 = scanner.nextBoolean();
        System.out.println("You gave the string "+ value5);
        System.out.println("You gave the integer " + value6);
        System.out.println("You gave the double "+ value7);
        System.out.println("You gave the boolean " + value8);
        
        
    }
}
