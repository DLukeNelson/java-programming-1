
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
public class Stack {
    private ArrayList<String> strings;
    
    public Stack() {
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.strings.isEmpty();
    }
    
    public void add(String value) {
        this.strings.add(value);
    }
    
    public ArrayList<String> values() {
        return this.strings;
    }
    
    public String take() {
        int lastIndex = this.strings.size() - 1;
        String value = this.strings.get(lastIndex);
        this.strings.remove(lastIndex);
        return value;
    }
}
