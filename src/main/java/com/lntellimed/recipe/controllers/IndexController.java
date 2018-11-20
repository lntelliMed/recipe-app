package com.lntellimed.recipe.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lntellimed.recipe.domain.Category;
import com.lntellimed.recipe.domain.UnitOfMeasure;
import com.lntellimed.recipe.repositories.CategoryRepository;
import com.lntellimed.recipe.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

		System.out.println("Cat Id is: " + categoryOptional.get().getId());
		System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());
		
		return "index";
	}
}