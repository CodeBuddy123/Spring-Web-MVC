package com.ashsoft.exception;

public class MarksOutOfBoundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
    
	String exception_Message;
	
	public MarksOutOfBoundsException(String exception_Message) {
		this.exception_Message=exception_Message;
	}
	
	public void setException_Message(String exception_Message) {
		this.exception_Message = exception_Message;
	}
	
	public String getException_Message() {
		return exception_Message;
	}
}
