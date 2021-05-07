/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class Bird {
    private String name;
    private String latin;
    private int observations;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void observe() {
        this.observations += 1;
    }
    
    @Override
    public String toString() {
        String description = this.name + " (" + this.latin + "): ";
        if (this.observations == 1) {
            description += "1 observation";
        } else {
            description += this.observations + " observations";
        }
        return description;
    }
}
