
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int counter = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        while (counter <= last) {
            sum += counter;
            counter += 1;
        }
        System.out.println("The sum is " + sum);
    }
}
