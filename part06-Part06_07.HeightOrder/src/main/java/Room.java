
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
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        Person shortest = null;
        int minHeight = Integer.MAX_VALUE;
        for (Person person: this.persons) {
            if (person.getHeight() < minHeight) {
                shortest = person;
                minHeight = person.getHeight();
            }
        }
        return shortest;
    }
}
