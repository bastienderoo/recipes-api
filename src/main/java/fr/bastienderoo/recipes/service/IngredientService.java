package fr.bastienderoo.recipes.service;

import fr.bastienderoo.recipes.entity.Ingredient;
import fr.bastienderoo.recipes.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public Ingredient getByID(Long id) {
        return ingredientRepository.findById(id).orElseThrow();
    }

    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }

    public Ingredient add(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public Ingredient edit(Long id, Ingredient ingredientEdited) {
        Ingredient ingredient = getByID(id);
        ingredient.setName(ingredientEdited.getName());
        return ingredientRepository.save(ingredient);
    }

    public Long delete(Long id) {
        ingredientRepository.deleteById(id);
        return id;
    }
}
