package de.nein.backend.service;

import de.nein.backend.dto.AddressDTO;
import de.nein.backend.entity.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    public Address convertToEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        address.setHouseNumber(addressDTO.getHouseNumber());
        address.setPlz(addressDTO.getPlz());
        address.setCity(addressDTO.getCity());
        address.setCountry(addressDTO.getCountry());
        return address;
    }

}
