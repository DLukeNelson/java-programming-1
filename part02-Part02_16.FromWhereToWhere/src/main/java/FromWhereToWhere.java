
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int goal = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        while (counter <= goal) {
            System.out.println(counter);
            counter += 1;
        }
    }
}
