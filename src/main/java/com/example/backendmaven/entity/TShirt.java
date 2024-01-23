package com.example.backendmaven.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TShirt {

    @Id
    private Long id;
    private String groesse;
    private String material;
    private double ekPreis ;
    private double vkPreis;
    private int print;
    private int farbe;

}
