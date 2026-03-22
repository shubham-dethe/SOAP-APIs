package com.example.service;

import org.springframework.http.HttpStatus;

public class GitServiceException extends RuntimeException {

	private String errorMessage;
	private HttpStatus httpStatus;
	
	@Override
	public String getMessage() {
		
		return errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public GitServiceException(String errorMessage, HttpStatus httpStatus) {
		super();
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
	}
	
	

}
