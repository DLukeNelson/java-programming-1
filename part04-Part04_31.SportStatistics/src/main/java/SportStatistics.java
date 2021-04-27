
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
        
        int wins = 0;
        int losses = 0;
        for (SportStatistic record: records) {
            if (team.equals(record.getWinningTeam())) {
                wins += 1;
            } else if (team.equals(record.getLosingTeam())) {
                losses += 1;
            }
        }
        
        System.out.println("Games: " + (wins + losses));
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

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
