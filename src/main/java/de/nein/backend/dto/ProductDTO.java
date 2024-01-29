package de.nein.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private ProductTypeDTO productType;
    private String size;
    private String name;
    private List<MaterialTypeDTO> materialType;
    private double costs;
    private double price;
    private MaterialColorDTO color;
}
