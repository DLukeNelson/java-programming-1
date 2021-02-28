
import java.util.Scanner;

public class SecondsInADay {
    public static final int SECONDS_PER_DAY = 86400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int numDays = Integer.valueOf(scanner.nextLine());
        System.out.println(numDays * SECONDS_PER_DAY);

    }
}
