
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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = suitcase.totalWeight() + this.totalWeight();
        if (totalWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + "suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
    
    private int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase: this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }
}
