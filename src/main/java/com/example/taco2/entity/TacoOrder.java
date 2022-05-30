package com.example.taco2.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.*;

@Data
public class TacoOrder implements Serializable {
    private Long id;
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private Date createdAt = new Date();

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
