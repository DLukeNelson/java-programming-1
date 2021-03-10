
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.valueOf(scanner.nextLine());
        while (counter <= 100) {
            System.out.println(counter);
            counter += 1;
        }
    }
}
