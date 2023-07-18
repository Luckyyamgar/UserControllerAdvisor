package com.example.demo.exception;

@SuppressWarnings("serial")
public class InvalidUrlException extends RuntimeException {

    public InvalidUrlException(String message) {
        super(message);
    }

}
 
