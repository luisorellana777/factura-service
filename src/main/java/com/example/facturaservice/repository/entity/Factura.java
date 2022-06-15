package com.example.facturaservice.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Document(collation = "factura")
public class Factura {

    @Id
    private Integer id;
    private String nombreUsuario;
    private Date fechaEmision;
}
