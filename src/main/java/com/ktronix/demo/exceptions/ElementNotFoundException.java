package com.ktronix.demo.exceptions;

public class ElementNotFoundException extends RuntimeException {

    public static final String ELEMENT_NOT_FOUND = "Could not find this element";
    public ElementNotFoundException(String message){
        super(message);
    }


}
