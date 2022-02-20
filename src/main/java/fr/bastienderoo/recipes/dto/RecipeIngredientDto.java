package fr.bastienderoo.recipes.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeIngredientDto {
    Long id;
    String unit;
    Double quantity;
    IngredientDto ingredient;
}
