package com.example.facturaservice.controller;

import com.example.facturaservice.dto.MessageResponse;
import com.example.facturaservice.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FacturaControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<MessageResponse> handNotFoundException(NotFoundException exception) {

        final MessageResponse messageResponse = MessageResponse.builder().message(exception.getMessage()).code(HttpStatus.NOT_FOUND.toString()).build();
        return new ResponseEntity(messageResponse, HttpStatus.NOT_FOUND);
    }
}
