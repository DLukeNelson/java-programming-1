
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        
        if (!(other instanceof Person)) {
            return false;
        }
        
        Person that = (Person) other;
        
        return this.name.equals(that.name)
                && this.birthday.equals(that.birthday)
                && this.height == that.height
                && this.weight == that.weight;
    }
}
