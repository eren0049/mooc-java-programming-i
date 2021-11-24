
public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int j = 0; j < size; j++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int j = 0; j < height; j++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        String star = "*";
        for (int j = 0; j < size; j++) {
            System.out.println(star);
            star = star + "*";
        }
    }
}
