package com.lntellimed.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
