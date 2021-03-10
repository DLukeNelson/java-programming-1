
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int last = Integer.valueOf(scanner.nextLine());
        
        int product = 1;
        int counter = 1;
        while (counter <= last) {
            product *= counter;
            counter += 1;
        }
        System.out.println("Factorial: " + product);
    }
}
