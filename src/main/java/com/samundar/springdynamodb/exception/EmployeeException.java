package com.samundar.springdynamodb.exception;

public class EmployeeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeException(String message) {
        super(message);
    }
}
