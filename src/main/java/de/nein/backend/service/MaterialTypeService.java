package de.nein.backend.service;

import de.nein.backend.dto.MaterialTypeDTO;
import de.nein.backend.entity.MaterialType;
import org.springframework.stereotype.Service;

@Service
public class MaterialTypeService {
    public MaterialType convertToEntity(MaterialTypeDTO materialTypeDTO) {
        MaterialType materialType = new MaterialType();
        materialType.setId(materialTypeDTO.getId());
        materialType.setMaterial(materialTypeDTO.getMaterial());
        return materialType;
    }

}
