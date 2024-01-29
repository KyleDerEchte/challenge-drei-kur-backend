package de.nein.backend.service;

import de.nein.backend.dto.MaterialColorDTO;
import de.nein.backend.entity.MaterialColor;
import org.springframework.stereotype.Service;

@Service
public class MaterialColorService {

    public MaterialColor convertToEntity(MaterialColorDTO materialColorDTO) {
        MaterialColor materialColor = new MaterialColor();
        materialColor.setId(materialColorDTO.getId());
        materialColor.setColor(materialColorDTO.getColor());
        return materialColor;
    }

}
