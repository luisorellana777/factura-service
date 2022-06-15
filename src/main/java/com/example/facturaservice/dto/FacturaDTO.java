package com.example.facturaservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class FacturaDTO {

    private Integer id;
    private String usuario;
    private Date emision;
}
