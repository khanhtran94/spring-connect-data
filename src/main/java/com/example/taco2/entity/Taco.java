package com.example.taco2.entity;
import java.util.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
public class Taco {
    @Id
    private Long id;
    private String name;
    private List<Ingredient> ingredients;
    private Date createdAt = new Date();
}
