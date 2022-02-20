package fr.bastienderoo.recipes.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RecipeDto {
    Long id;
    String name;
    String picture;
    List<RecipeIngredientDto> recipeIngredients;
    String vege;
}
