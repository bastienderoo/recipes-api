package fr.bastienderoo.recipes.mapper;

import fr.bastienderoo.recipes.dto.IngredientDto;
import fr.bastienderoo.recipes.dto.RecipeDto;
import fr.bastienderoo.recipes.dto.RecipeIngredientDto;
import fr.bastienderoo.recipes.entity.Ingredient;
import fr.bastienderoo.recipes.entity.Recipe;
import fr.bastienderoo.recipes.entity.RecipeIngredient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {

    RecipeMapper INSTANCE = Mappers.getMapper(RecipeMapper.class);

    @Mapping(source = "recipeIngredients", target = "recipeIngredients")
    RecipeDto recipeToRecipeDto(Recipe recipe);

    @Mapping(source = "ingredient", target = "ingredient")
    RecipeIngredientDto recipeIngredientToRecipeIngredientDto(RecipeIngredient recipeIngredient);

    IngredientDto ingredientToIngredientDto(Ingredient ingredient);

}
