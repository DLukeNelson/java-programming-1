
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = item.getWeight() + this.weight();
        if (totalWeight <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    @Override
    public String toString() {
        String numItems = null;
        if (this.items.size() == 0) {
            numItems = "no items";
        } else if (this.items.size() == 1) {
            numItems = "1 item";
        } else {
            numItems = this.items.size() + " items";
        }
        return numItems + " (" + this.weight() + " kg)";
    }
    
    private int weight() {
        int weight = 0;
        for (Item item: this.items) {
            weight += item.getWeight();
        }
        return weight;
    }
    
}
