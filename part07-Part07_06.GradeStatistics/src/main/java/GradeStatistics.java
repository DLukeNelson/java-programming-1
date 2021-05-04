
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class GradeStatistics {
    private ArrayList<Integer> gradePoints;
    
    public GradeStatistics() {
        this.gradePoints = new ArrayList<>();
    }
    
    public void add(int points) {
        this.gradePoints.add(points);
    }
    
    public double averagePoints() {
        int sum = 0;
        for (int points: this.gradePoints) {
            sum += points;
        }
        return sum * 1.0 / this.gradePoints.size();
    }
    
    public double averagePassing() {
        int sum = 0;
        int passing = 0;
        for (int points: this.gradePoints) {
            if (passed(points)) {
                passing += 1;
                sum += points;
            }
        }
        if (passing > 0) {
            return sum * 1.0 / passing;
        } else {
            return -1;
        }
    }
    
    private boolean passed(int points) {
        return points >= 50;
    }
    
    public double passPercentage() {
        int passing = 0;
        for (int points: this.gradePoints) {
            if (passed(points)) {
                passing += 1;
            }
        }
        return 100.0 * passing / this.gradePoints.size();
    }
}
