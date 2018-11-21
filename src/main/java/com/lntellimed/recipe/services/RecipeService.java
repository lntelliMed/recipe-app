package com.lntellimed.recipe.services;

import com.lntellimed.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
	Set<Recipe> getRecipes();
}