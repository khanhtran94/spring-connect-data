package com.example.taco2;

import com.example.taco2.data.IngredientRepository;
import com.example.taco2.entity.Ingredient;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.taco2.entity.Ingredient.Type;

@SpringBootApplication
public class Taco2Application {

    public static void main(String[] args) {
        SpringApplication.run(Taco2Application.class, args);
    }
    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return args -> {
            repo.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
            repo.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
            repo.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
            repo.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
            repo.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
            repo.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
            repo.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
            repo.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
            repo.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
            repo.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
        };
    }
//    @Bean
//    public ApplicationRunner dataLoaderApp(IngredientRepository repo) {
//        return args -> {
//            repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//            repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//            repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//            repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//            repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//            repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//            repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
//            repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//            repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
//            repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//        };
//    }
}
