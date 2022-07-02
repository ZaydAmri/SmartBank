package com.example.SmartBank.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(com.example.SmartBank.Exception.RessourceDuplicated.class)
    public ResponseEntity<?> ressourceDuplicated(com.example.SmartBank.Exception.RessourceDuplicated ressourceDuplicated, WebRequest webRequest){
        com.example.SmartBank.Exception.ErrorDetails errorDetails = new com.example.SmartBank.Exception.ErrorDetails(new Date(),ressourceDuplicated.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.FOUND);
    }

    @ExceptionHandler(com.example.SmartBank.Exception.RessourceNotFound.class)
    public ResponseEntity<?> ressourceNotFound(com.example.SmartBank.Exception.RessourceNotFound ressourceNotFound){
        com.example.SmartBank.Exception.ErrorDetails errorDetails = new com.example.SmartBank.Exception.ErrorDetails(ressourceNotFound.getMessage());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalExceptionHandler(Exception exception,WebRequest webRequest){
        com.example.SmartBank.Exception.ErrorDetails errorDetails = new com.example.SmartBank.Exception.ErrorDetails(new Date(),"Service indisponible",webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
