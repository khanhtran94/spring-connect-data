package com.example.taco2.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class TacoOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCvv;
    private Date createdAt = new Date();

    //thuoc tinh cascade = CascadeType.ALL quyet dinh viec luu taco hay khong
    //todo: quenstion nhung khong hieu sao luu duoc taco nhung khong luu duoc khoa ngoai la tacoOrderId
    //fiel taco_order_id cua taco
    @OneToMany(mappedBy = "tacoOrder", cascade = CascadeType.ALL)
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
