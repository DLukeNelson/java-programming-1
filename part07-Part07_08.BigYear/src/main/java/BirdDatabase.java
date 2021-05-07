
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
public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public Bird findByName(String name) {
        for (Bird bird: this.birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }
    
    public ArrayList<Bird> getAllBirds() {
        return this.birds;
    }
}
