/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class SportStatistic {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public SportStatistic(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    
    public String getWinningTeam() {
        return this.homePoints > this.visitingPoints ? this.homeTeam : this.visitingTeam;
    }
    
    public String getLosingTeam() {
        return this.homePoints > this.visitingPoints ? this.visitingTeam : this.homeTeam;
    }
}
