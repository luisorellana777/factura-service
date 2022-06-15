package com.example.facturaservice.repository;

import com.example.facturaservice.repository.entity.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface FacturaRepository extends MongoRepository<Factura, Integer> {

    @Query("{ 'id' :?0, 'nombreUsuario' :?1}")
    Optional<Factura> findByIdAndNombreUsuario(Integer id, String nombreUsuario);
}
