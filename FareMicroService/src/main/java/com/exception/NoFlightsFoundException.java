package com.exception;

public class NoFlightsFoundException extends RuntimeException {

	public NoFlightsFoundException(String msg) {
		super(msg);
	}

}
