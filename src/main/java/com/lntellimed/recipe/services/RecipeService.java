package com.lntellimed.recipe.services;

import com.lntellimed.recipe.domain.Recipe;

import com.lntellimed.recipe.commands.RecipeCommand;

import java.util.Set;

public interface RecipeService {
	Set<Recipe> getRecipes();

	Recipe findById(Long l);

	RecipeCommand saveRecipeCommand(RecipeCommand command);
}