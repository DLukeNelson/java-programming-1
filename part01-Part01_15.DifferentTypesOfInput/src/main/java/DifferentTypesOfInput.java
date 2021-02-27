
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String theString = scanner.nextLine();
        System.out.println("Give an integer:");
        int theInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double theDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean theBoolean = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + theString);
        System.out.println("You gave the integer " + theInt);
        System.out.println("You gave the double " + theDouble);
        System.out.println("You gave the boolean " + theBoolean);
    }
}
