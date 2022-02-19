package fr.bastienderoo.recipes.controller;

import fr.bastienderoo.recipes.dto.IngredientDto;
import fr.bastienderoo.recipes.entity.Ingredient;
import fr.bastienderoo.recipes.mapper.IngredientMapper;
import fr.bastienderoo.recipes.service.IngredientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredients/{id}")
    public ResponseEntity<IngredientDto> getById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(IngredientMapper.INSTANCE.ingredientToIngredientDto(ingredientService.getByID(id)));
    }

    @GetMapping("/ingredients")
    public ResponseEntity<List<IngredientDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(ingredientService.getAll()
                .stream()
                .map(IngredientMapper.INSTANCE::ingredientToIngredientDto)
                .collect(Collectors.toList())
        );
    }

    @PostMapping("/ingredients")
    public ResponseEntity<Long> add(@RequestBody Ingredient ingredient) {
        return ResponseEntity.status(HttpStatus.OK).body(ingredientService.add(ingredient).getId());
    }


    @PutMapping("/ingredients/{id}")
    public ResponseEntity<Ingredient> edit(@PathVariable Long id, @RequestBody Ingredient ingredient) {
        return ResponseEntity.status(HttpStatus.OK).body(ingredientService.edit(id, ingredient));
    }

    @DeleteMapping("/ingredients/{id}")
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(ingredientService.delete(id));
    }

}
