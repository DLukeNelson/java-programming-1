
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
    private BirdDatabase database;
    
    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.database = database;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            processCommand(command);
        }
    }
    
    private void processCommand(String command) {
        if (command.equals("Add")) {
            add();
        } else if (command.equals("Observation")) {
            observe();
        } else if (command.equals("All")) {
            showAll();
        } else if (command.equals("One")) {
            showOne();
        }
    }
    
    private void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in latin: ");
        String latin = scanner.nextLine();
        this.database.addBird(new Bird(name, latin));
    }
    
    private void observe() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        Bird bird = this.database.findByName(name);
        if (bird == null) {
            System.out.println("Not a bird!");
            return;
        }
        bird.observe();
    }

    private void showAll() {
        for (Bird bird: this.database.getAllBirds()) {
            System.out.println(bird);
        }
    }
    
    private void showOne() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        Bird bird = this.database.findByName(name);
        if (bird == null) {
            System.out.println("Not a bird!");
            return;
        }
        System.out.println(bird);
    }
}
