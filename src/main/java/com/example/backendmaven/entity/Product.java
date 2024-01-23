package com.example.backendmaven.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "product_type")
    @ManyToOne
    private ProductType productType;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "name", nullable = false)
    private String name;

    @JoinColumn(name = "material_type", nullable = false)
    @OneToMany(targetEntity = MaterialType.class)
    private Set<MaterialType> materialType;

    @Column(name = "costs_without_vat", nullable = false)
    private double costs;

    @Column(name = "price_without_vat", nullable = false)
    private double price;

    @JoinColumn(name = "color", nullable = false)
    @ManyToOne
    private MaterialColor color;

}
