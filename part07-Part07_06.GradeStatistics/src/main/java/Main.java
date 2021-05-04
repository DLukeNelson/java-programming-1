
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics stats = new GradeStatistics();
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points >= 0 && points <= 100) {
                stats.add(points);
            }
        }
        
        System.out.println("Point average (all): " + stats.averagePoints());
    }
}
