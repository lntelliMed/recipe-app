package com.lntellimed.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.recipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
