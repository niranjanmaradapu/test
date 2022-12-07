package com.otsi.testdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private Logger log = LogManager.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(ResponseStatusException.class)
	public ResponseEntity<?> handleResponseStatusException(ResponseStatusException ex) {
		ErrorResponse<?> error = new ErrorResponse<>(ex.getRawStatusCode(), ex.getReason());
		log.error("error response is:" + error + " status:" + ex.getStatus());
		return new ResponseEntity<>(error, ex.getStatus());
	}


}
