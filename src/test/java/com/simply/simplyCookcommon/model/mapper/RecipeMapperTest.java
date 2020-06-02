package com.simply.simplyCookcommon.model.mapper;


import com.simply.simplyCookcommon.model.Recipe;
import com.simply.simplyCookcommon.model.RecipeLight;
import java.util.List;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecipeMapperTest {

  @Test
  public void recipeToLight() {
    Recipe recipe = Recipe.builder().build();
    recipe.setName("name");
    recipe.setId(new ObjectId());
    recipe.setKeywords(List.of("keyword"));
    RecipeLight recipeLight = RecipeMapper.INSTANCE.recipeToLight(recipe);
    Assertions.assertTrue(recipeLight.getName().equals(recipe.getName()));
  }
}