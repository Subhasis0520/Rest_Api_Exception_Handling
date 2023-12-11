package com.org.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExecptionHandler {

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> handleUserNFE(UserNotFoundException ue){
		ErrorInfo ef = new ErrorInfo();
		ef.setCode("SBIWX001");
		ef.setErrorMsg(ue.getMessage());
		ef.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(ef, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		ErrorInfo ef = new ErrorInfo();
		ef.setCode("SBIWX001");
		ef.setErrorMsg(e.getMessage());
		ef.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(ef, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
