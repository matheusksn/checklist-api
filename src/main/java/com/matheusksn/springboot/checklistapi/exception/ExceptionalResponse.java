package com.matheusksn.springboot.checklistapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExceptionalResponse {

    private LocalDateTime timestamp;
    private String message;
    private HttpStatus status;

}
