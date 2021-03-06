package com.algaworks.api.algafood.domain.dtos;


import com.algaworks.api.algafood.domain.model.Kitchen;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class DTORestaurant {

    private UUID id;


    private String name;


    private BigDecimal delivery_tax;


    private Kitchen kitchen;
}
