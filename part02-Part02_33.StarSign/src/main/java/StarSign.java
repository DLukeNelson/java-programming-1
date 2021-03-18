
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
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
        while (number > 0) {
            System.out.print("*");
            number -= 1;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int numRows = size;
        while (numRows > 0) {
            printStars(size);
            numRows -= 1;
        }
    }

    public static void printRectangle(int width, int height) {
        while (height > 0) {
            printStars(width);
            height -= 1;
        }
    }

    public static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            printStars(row);
            row += 1;
        }
    }
}
