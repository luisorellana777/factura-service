package com.example.facturaservice.repository;

import com.example.facturaservice.repository.entity.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FacturaRepository extends MongoRepository<Factura, Integer> {

    List<Factura> findByNombreUsuario(String nombreUsuario);
}
