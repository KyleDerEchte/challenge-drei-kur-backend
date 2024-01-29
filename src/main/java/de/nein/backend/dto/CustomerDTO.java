package de.nein.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    @JsonIgnore
    private Long id;
    private String forename;
    private String surname;
    private String street;
    private String houseNumber;
    private String plz;
    private String city;
    private String country;
}
