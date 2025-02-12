package guru.springframework.services.recipe;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domains.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getAll();
    Recipe getById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
    RecipeCommand findCommandById(Long id);
    void deleteById(Long id);
}
