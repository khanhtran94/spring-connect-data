package com.example.taco2.entity;
import java.util.*;
import lombok.Data;

@Data
public class Taco {
    private Long id;
    private String name;
    private List<Ingredient> ingredients;
    private Date createdAt = new Date();
}
