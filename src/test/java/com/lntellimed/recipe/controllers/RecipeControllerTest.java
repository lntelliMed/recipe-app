package com.lntellimed.recipe.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.lntellimed.recipe.commands.RecipeCommand;
import com.lntellimed.recipe.domain.Recipe;
import com.lntellimed.recipe.services.RecipeService;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class RecipeControllerTest {

	@Mock
	RecipeService recipeService;

	RecipeController controller;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		controller = new RecipeController(recipeService);
	}

	@Test
	public void testGetRecipe() throws Exception {
		Recipe recipe = new Recipe();
		recipe.setId(1L);

		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		when(recipeService.findById(anyLong())).thenReturn(recipe);

		mockMvc.perform(get("/recipe/1/show")).andExpect(status().isOk()).andExpect(view().name("recipe/show"))
				.andExpect(view().name("recipe/show")).andExpect(model().attributeExists("recipe"));
	}

	@Test
	public void testGetUpdateView() throws Exception {
		RecipeCommand command = new RecipeCommand();
		command.setId(2L);

		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		when(recipeService.findCommandById(anyLong())).thenReturn(command);

		mockMvc.perform(get("/recipe/1/update")).andExpect(status().isOk()).andExpect(view().name("recipe/recipeform"))
				.andExpect(model().attributeExists("recipe"));
	}
}