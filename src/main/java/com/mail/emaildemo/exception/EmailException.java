package com.mail.emaildemo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmailException extends RuntimeException {

	private static final long serialVersionUID = 5618610024732043789L;
		public EmailException() {
	        super();
	    }
	    public EmailException(String message, Throwable cause) {
	        super(message, cause);
	    }
	    public EmailException(String message) {
	        super(message);
	    }
	    public EmailException(Throwable cause) {
	        super(cause);
	    }
}
