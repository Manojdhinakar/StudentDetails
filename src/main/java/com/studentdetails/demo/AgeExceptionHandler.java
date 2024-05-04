package com.studentdetails.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AgeExceptionHandler {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> ageException(AgeException a){
		return new ResponseEntity<>("Age is Below 18 , So the Data Cannot be Added",HttpStatus.NOT_ACCEPTABLE);
	}

}
