package com.example.facturaservice.service;

import com.example.facturaservice.dto.FacturaDTO;
import com.example.facturaservice.mapper.FacturaMapper;
import com.example.facturaservice.repository.FacturaRepository;
import com.example.facturaservice.repository.entity.Factura;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FacturaService {

    private FacturaRepository facturaRepository;
    private FacturaMapper facturaMapper;

    public void saveFactura(FacturaDTO facturaDto) {

        this.facturaRepository.save(facturaMapper.dtoToEntity(facturaDto));
    }

    public FacturaDTO getOne(Integer id) {

        return facturaMapper.entityToDto(this.facturaRepository.findById(id).get());
    }

    public Factura getOne(Integer id, String nombre) {

        return this.facturaRepository.findByIdAndNombreUsuario(id, nombre).get();
    }

}
