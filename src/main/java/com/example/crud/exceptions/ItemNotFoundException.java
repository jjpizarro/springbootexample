package com.example.crud.exceptions;

public class ItemNotFoundException extends RuntimeException {

    public ItemNotFoundException() {
    }

    public ItemNotFoundException(String message) {
        super(message);
    }
    
}
