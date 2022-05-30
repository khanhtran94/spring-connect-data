package com.example.taco2.entity;
import java.util.*;
import lombok.Data;
import org.apache.ibatis.annotations.Many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Data
@Entity
public class Taco {
    @Id
    private Long id;
    private String name;
    @ManyToMany
    private List<Ingredient> ingredients;
    private Date createdAt = new Date();
}
