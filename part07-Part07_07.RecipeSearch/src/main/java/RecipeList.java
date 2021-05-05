
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
    
    public String listRecipes() {
        String description = "";
        for (Recipe recipe: this.recipes) {
            description += recipe.toString() + "\n";
        }
        return description;
    }
}
