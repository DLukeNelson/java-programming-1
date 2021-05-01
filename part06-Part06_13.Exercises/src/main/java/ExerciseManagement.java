
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<String> exercises;
    private ArrayList<String> completed;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
        this.completed = new ArrayList<>();
    }
    public ArrayList<String> exerciseList() {
        return this.exercises;
    }
    
    public void add(String exercise) {
        this.exercises.add(exercise);
    }
    
    public void markAsCompleted(String exercise) {
        this.completed.add(exercise);
    }
    
    public boolean isCompleted(String exercise) {
        return this.completed.contains(exercise);
    }
}
