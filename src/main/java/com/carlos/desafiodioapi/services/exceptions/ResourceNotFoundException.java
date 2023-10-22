package com.carlos.desafiodioapi.services.exceptions;

public class ResourceNotFoundException  extends RuntimeException{
	
	public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
