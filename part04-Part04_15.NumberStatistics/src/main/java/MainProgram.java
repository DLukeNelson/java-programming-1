
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        
        System.out.println("Enter numbers: ");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            
            allNumbers.addNumber(number);
        }
        System.out.println("Sum: " + allNumbers.sum());
    }
}
