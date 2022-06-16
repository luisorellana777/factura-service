package com.example.facturaservice.exception;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class NotFoundException extends RuntimeException {

    private String message;
}
