
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
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            this.processCommand(command);
        }
    }
    
    private void processCommand(String command) {
        if (command.equals("add")) {
            this.addTask();
        } else if (command.equals("list")) {
            this.listTasks();
        } else if (command.equals("remove")) {
            this.removeTask();
        }
    }
    
    private void addTask() {
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }
    
    private void listTasks() {
        this.todoList.print();
    }
    
    private void removeTask() {
        System.out.println("Which one is removed? ");
        int toRemove = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(toRemove);
    }
}
