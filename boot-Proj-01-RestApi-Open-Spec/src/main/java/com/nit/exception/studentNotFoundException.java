package com.nit.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class studentNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	public studentNotFoundException()
	{
		super();
	}
	public studentNotFoundException(String message)
	{
		super(message);
	}

}
