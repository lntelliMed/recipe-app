package com.lntellimed.recipe.services;

import java.util.Set;

import com.lntellimed.recipe.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

	Set<UnitOfMeasureCommand> listAllUoms();
}