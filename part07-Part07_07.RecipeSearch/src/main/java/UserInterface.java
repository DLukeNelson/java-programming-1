
import java.io.IOException;
import java.nio.file.Paths;
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
    private RecipeList recipeList;
    
    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }
    
    public void start() {
        getRecipes();
        acceptCommands();
    }
    
    private void getRecipes() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            readRecipes(fileScanner);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + fileName);
        }
    }
    
    private void readRecipes(Scanner fileScanner) {
        while (fileScanner.hasNextLine()) {
            String name = fileScanner.nextLine();
            int cookingTime = Integer.valueOf(fileScanner.nextLine());
            Recipe recipe = new Recipe(name, cookingTime);
            readIngredients(fileScanner, recipe);
            this.recipeList.addRecipe(recipe);
        }
    }
    
    private void readIngredients(Scanner fileScanner, Recipe recipe) {
        while (true) {
            if (!fileScanner.hasNextLine()) {
                break;
            }
            String ingredient = fileScanner.nextLine();
            if (ingredient.isEmpty()) {
                break;
            }
            recipe.addIngredient(ingredient);
        }
    }
    
    private void acceptCommands() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program\n");
            System.out.println("Enter command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if(command.equals("list")) {
                list();
            }
        }
    }
    
    private void list() {
        System.out.println(recipeList.listRecipes());
    }
}
