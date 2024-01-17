package com.example.U5W2D3.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(int id) {
        super("item with " + id + " not found.");
    }
}
