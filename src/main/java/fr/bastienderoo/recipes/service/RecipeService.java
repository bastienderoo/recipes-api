package fr.bastienderoo.recipes.service;

import fr.bastienderoo.recipes.entity.Recipe;
import fr.bastienderoo.recipes.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe getByID(Long id) {
        return recipeRepository.findById(id).orElseThrow();
    }

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public Recipe add(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public Recipe edit(Long id, Recipe recipeEdited) {
        Recipe recipe = getByID(id);
        recipe.setName(recipeEdited.getName());
        return recipeRepository.save(recipe);
    }

    public Long delete(Long id) {
        recipeRepository.deleteById(id);
        return id;
    }
}
