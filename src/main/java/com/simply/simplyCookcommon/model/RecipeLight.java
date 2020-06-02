package com.simply.simplyCookcommon.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "recipe")
@Data
@Builder
public class RecipeLight {
  @Id
  private String id;
  private final String name;
  private List<String> keywords;
  private LevelProductComplexity levelProductComplexity;
  private LevelCookDifficulty levelCookDifficulty;
}
