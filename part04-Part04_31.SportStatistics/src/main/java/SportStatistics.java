
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Filename:");
        String fileName = scanner.nextLine();

        ArrayList<SportStatistic> records = readRecordsFromFile(fileName);
        
        System.out.println("Team:");
        String team = scanner.nextLine();
        
        int games = 0;
        for (SportStatistic record: records) {
            if (team.equals(record.getWinningTeam()) || team.equals(record.getLosingTeam())) {
                games += 1;
            }
        }
        
        System.out.println("Games: " + games);

    }

    public static ArrayList<SportStatistic> readRecordsFromFile(String fileName) {
        ArrayList<SportStatistic> statistics = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                SportStatistic stat = new SportStatistic(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                statistics.add(stat);
            }
        } catch (Exception e) {
            System.out.println("Unable to read file: " + fileName);
        }
        return statistics;

    }

}
