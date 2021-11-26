package com.mail.emaildemo.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class EmailRequest {
	
	@NotNull
	private String subject;
	
	@NotNull
	@Email
	private String emailTo;
	
	@NotNull
	@Email
	private String emailFrom;
	
	@NotNull
	@Min(5)
	private String message;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	
	@Override
	public String toString() {
		return "EmailRequest [subject=" + subject + ", emailTo=" + emailTo + ", message=" + message + "]";
	}
}
