package fr.bastienderoo.recipes.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IngredientDto {
    Long id;
    String name;
    String picture;
}
