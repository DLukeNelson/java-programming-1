
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sumOfBirthYears = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            int birthYear = Integer.valueOf(parts[1]);
            sumOfBirthYears += birthYear;
            count += 1;
        }
        System.out.println("Longest name: " + longestName);
        double average = sumOfBirthYears * 1.0 / count;
        System.out.println("Average of the birth years: " + average);
    }
}
