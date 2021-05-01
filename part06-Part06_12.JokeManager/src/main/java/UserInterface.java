
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            
            this.processCommand(command);
        }
    }
    
    private void processCommand(String command) {
        if (command.equals("1")) {
            this.addJoke();
        } else if (command.equals("2")) {
            this.drawJoke();
        } else if (command.equals("3")) {
            this.listJokes();
        }
    }
    
    private void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }
    
    private void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(this.jokeManager.drawJoke());
    }
    
    private void listJokes() {
        System.out.println("Printing the jokes.");
        this.jokeManager.printJokes();
    }
}
