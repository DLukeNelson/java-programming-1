
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file?");
        String fileName = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                System.out.println(new Person(parts[0], Integer.valueOf(parts[1])));
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: " + fileName);
        }

    }
}
