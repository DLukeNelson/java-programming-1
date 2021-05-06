
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
public class RecipeList {
    private ArrayList<Recipe> recipes;
    
    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    private String listRecipesFrom(ArrayList<Recipe> recipes) {
        String description = "";
        for (Recipe recipe: recipes) {
            description += recipe.toString() + "\n";
        }
        return description;
    }
    
    public String listRecipes() {
        return listRecipesFrom(this.recipes);
    }
    
    public String searchNames(String name) {
        ArrayList<Recipe> matches = new ArrayList<>();
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(name)) {
                matches.add(recipe);
            }
        }
        return listRecipesFrom(matches);
    }
    
    public String timesLessThan(int maxTime) {
        ArrayList<Recipe> shortEnough = new ArrayList<>();
        for (Recipe recipe: this.recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                shortEnough.add(recipe);
            }
        }
        return listRecipesFrom(shortEnough);
    }
    
    public String recipesUsingIngredient(String ingredient) {
        ArrayList<Recipe> hasIngredient = new ArrayList<>();
        for (Recipe recipe: this.recipes) {
            if (recipe.usesIngredient(ingredient)) {
                hasIngredient.add(recipe);
            }
        }
        return listRecipesFrom(hasIngredient);
    }
}
