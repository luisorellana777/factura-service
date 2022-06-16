package com.example.facturaservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class MessageResponse {
    
    private String message;
    private String code;
}
