package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(studentNotFoundException.class)
	public ResponseEntity<ApiResponse> handleStudNotFoundExcep(studentNotFoundException ex)
	{
		//String message = ex.getMessage();
		ApiResponse apires=new ApiResponse(ex.getMessage(), "Student_Not_Found", "Student Not found with given ID","Student");
		return new ResponseEntity<ApiResponse>(apires, HttpStatus.NOT_FOUND);
	}

}
