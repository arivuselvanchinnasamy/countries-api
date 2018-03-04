package com.arivu.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2658015683873516770L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}

