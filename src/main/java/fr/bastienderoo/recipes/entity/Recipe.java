package fr.bastienderoo.recipes.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import fr.bastienderoo.recipes.enums.Vege;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String picture;
    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private List<RecipeIngredient> recipeIngredients;


    public Vege getVege() {
        if(this.recipeIngredients.stream().anyMatch(recipeIngredient -> recipeIngredient.getIngredient().getIngredientType().getVege().equals(Vege.MEAT_OR_FISH))) {
            return Vege.MEAT_OR_FISH;
        }
        if(this.recipeIngredients.stream().anyMatch(recipeIngredient -> recipeIngredient.getIngredient().getIngredientType().getVege().equals(Vege.VEGETARIAN))) {
            return Vege.VEGETARIAN;
        }
        return Vege.VEGAN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Recipe that = (Recipe) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
