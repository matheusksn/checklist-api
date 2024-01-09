package com.matheusksn.springboot.checklistapi.exception;

public class CategoryServiceException extends RuntimeException{

    public CategoryServiceException(String message){
        super(message);
    }
}
