package fr.bastienderoo.recipes.controller;

import fr.bastienderoo.recipes.dto.RecipeDto;
import fr.bastienderoo.recipes.entity.Recipe;
import fr.bastienderoo.recipes.mapper.RecipeMapper;
import fr.bastienderoo.recipes.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/{id}")
    public ResponseEntity<RecipeDto> getById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(RecipeMapper.INSTANCE.recipeToRecipeDto(recipeService.getByID(id)));
    }

    @GetMapping("/recipes")
    public ResponseEntity<List<RecipeDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(recipeService.getAll()
                .stream()
                .map(RecipeMapper.INSTANCE::recipeToRecipeDto)
                .collect(Collectors.toList())
        );
    }

    @PostMapping("/recipes")
    public ResponseEntity<Long> add(@RequestBody Recipe recipe) {
        return ResponseEntity.status(HttpStatus.OK).body(recipeService.add(recipe).getId());
    }


    @PutMapping("/recipes/{id}")
    public ResponseEntity<Recipe> edit(@PathVariable Long id, @RequestBody Recipe recipe) {
        return ResponseEntity.status(HttpStatus.OK).body(recipeService.edit(id, recipe));
    }

    @DeleteMapping("/recipes/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(recipeService.delete(id));
    }

}
