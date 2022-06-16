package com.example.facturaservice.service;

import com.example.facturaservice.dto.FacturaDTO;
import com.example.facturaservice.mapper.FacturaMapper;
import com.example.facturaservice.repository.FacturaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<FacturaDTO> getFacturasByNombre(String nombre) {

        return this.facturaRepository.findByNombreUsuario(nombre).stream().map(facturaMapper::entityToDto).collect(Collectors.toList());
    }

}
