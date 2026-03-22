package com.example.globalexception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.service.GitServiceException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(GitServiceException.class)
	public ResponseEntity<String> handleGitServiceExcepion(GitServiceException gitServiceException) {

		return new ResponseEntity<String>(gitServiceException.getErrorMessage(), gitServiceException.getHttpStatus());
	}

}
