package com.example.taco2.data;

import com.example.taco2.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
