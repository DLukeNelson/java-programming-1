
public class AdvancedAstrology {

    public static void printStars(int number) {
        while (number > 0) {
            System.out.print("*");
            number -= 1;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        while (number > 0) {
            System.out.print(" ");
            number -= 1;
        }
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            printSpaces(size - row);
            printStars(row);
            row += 1;
        }
    }

    public static void christmasTree(int height) {
        int row = 1;
        while (row <= height) {
            printSpaces(height - row);
            printStars(2 * row - 1);
            row += 1;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
