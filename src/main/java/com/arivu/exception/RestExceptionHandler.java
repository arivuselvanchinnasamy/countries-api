package com.arivu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ ResourceNotFoundException.class })
	@ResponseBody
	public ResponseEntity<ResourceNotFoundException> handleNotFoundException(ResourceNotFoundException e) {		
		return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
	}
}
