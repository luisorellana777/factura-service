package com.example.facturaservice.controller;

import com.example.facturaservice.dto.FacturaDTO;
import com.example.facturaservice.service.FacturaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class FacturaController {

    private FacturaService facturaService;

    @PostMapping("/facturas")
    public HttpStatus saveFacuta(@RequestBody FacturaDTO facturaDto) {

        this.facturaService.saveFactura(facturaDto);
        return HttpStatus.CREATED;
    }

    @GetMapping("/facturas/{idFactura}")
    public ResponseEntity<FacturaDTO> getOneFactura(@PathVariable Integer idFactura) {

        final FacturaDTO one = this.facturaService.getOne(idFactura);

        return new ResponseEntity<>(one, HttpStatus.ACCEPTED);
    }

    @GetMapping("/facturas/clientes/{nombreCliente}")
    public ResponseEntity<List<FacturaDTO>> getOneFacturaByIdAndName(@PathVariable String nombreCliente) {

        final List<FacturaDTO> one = this.facturaService.getFacturasByNombre(nombreCliente);

        return new ResponseEntity<>(one, HttpStatus.ACCEPTED);
    }

    @PutMapping("/facturas")
    public HttpStatus updateFacuta(@RequestBody FacturaDTO facturaDto) {

        this.facturaService.updateFactura(facturaDto);
        return HttpStatus.CREATED;
    }
}
