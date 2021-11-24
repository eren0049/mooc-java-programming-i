
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the points:");
        int number1 = scan.nextInt();
        if (number1 <0 ) {
            System.out.println("Grade : impossible!" );
        }else if (number1 >= 0 & number1<=49) {
            System.out.println("Grade :failed");
        }else if (number1 >= 50 & number1<=59) {
            System.out.println("Grade : 1");
        }else if (number1 >= 60 & number1<=69) {
            System.out.println("Grade : 2");
        }else if (number1 >= 70 & number1<=79) {
            System.out.println("Grade : 3");
        }else if (number1 >= 80 & number1<=89) {
            System.out.println("Grade : 4");
        }else if (number1 >= 90 & number1<=100) {
            System.out.println("Grade : 5");
        }else{
            System.out.println("Grade : incredible!");
        }
    }
}
