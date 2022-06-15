package com.example.facturaservice.mapper;

import com.example.facturaservice.dto.FacturaDTO;
import com.example.facturaservice.repository.entity.Factura;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface FacturaMapper {


    @Mappings({
            @Mapping(target = "usuario", source = "factura.nombreUsuario"),
            @Mapping(target = "emision", source = "factura.fechaEmision")
    })
    FacturaDTO entityToDto(Factura factura);


    @Mappings({
            @Mapping(target = "nombreUsuario", source = "facturaDTO.usuario"),
            @Mapping(target = "fechaEmision", source = "facturaDTO.emision")
    })
    Factura dtoToEntity(FacturaDTO facturaDTO);
}
