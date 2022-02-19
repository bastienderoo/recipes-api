package fr.bastienderoo.recipes.mapper;

import fr.bastienderoo.recipes.dto.IngredientDto;
import fr.bastienderoo.recipes.entity.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IngredientMapper {

    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);

    IngredientDto ingredientToIngredientDto(Ingredient ingredient);
}
