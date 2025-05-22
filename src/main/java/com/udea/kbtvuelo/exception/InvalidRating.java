package com.udea.kbtvuelo.exception;

public class InvalidRating extends RuntimeException{
    public InvalidRating(String message){
        super(message);
    }

    public InvalidRating(){
        super();
    }

}

