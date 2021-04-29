
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String description = "The collection " + name;
        if (this.elements.isEmpty()) {
            return description + " is empty.";
        }
        
        description += " has " + this.elements.size() + " element";
        if (this.elements.size() != 1) {
            description += "s";
        }
        description += ":";
        for (String element: elements) {
            description += "\n" + element;
        }
        return description;
    }
    
}
