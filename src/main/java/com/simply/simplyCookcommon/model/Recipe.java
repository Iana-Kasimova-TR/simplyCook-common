package com.simply.simplyCookcommon.model;

import java.util.List;
import lombok.Data;

@Data
public class Recipe {
  private String name;
  private long calories;
  private LevelProductComplexity levelProductComplexity;
  private LevelCookDifficulty levelCookDifficulty;
  private Object video;
  private List<StepCook> steps;
}
