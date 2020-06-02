package com.simply.simplyCookcommon.model.mapper;

import com.simply.simplyCookcommon.model.Recipe;
import com.simply.simplyCookcommon.model.RecipeLight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {

  RecipeMapper INSTANCE = Mappers.getMapper( RecipeMapper.class );


  @Mapping(target = "id", ignore = true)
  RecipeLight recipeToLight(Recipe recipe);
}
