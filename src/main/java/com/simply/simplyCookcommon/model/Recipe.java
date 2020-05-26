package com.simply.simplyCookcommon.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "recipe")
public class Recipe {
  @Id
  private String id;
  private String name;
  private long calories;
  private LevelProductComplexity levelProductComplexity;
  private LevelCookDifficulty levelCookDifficulty;
  private Object video;
  private List<StepCook> steps;
}
