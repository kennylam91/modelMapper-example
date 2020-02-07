package com.spring.modelMapper.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@ControllerAdvice
public class RestExceptionHandle extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({Exception.class})
	public ResponseEntity<Object> handleException(Exception ex){
		System.out.println("InvalidFormatException");
		return new ResponseEntity<>(ex,HttpStatus.UNSUPPORTED_MEDIA_TYPE);
	}

}
