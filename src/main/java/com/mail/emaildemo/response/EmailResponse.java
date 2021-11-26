package com.mail.emaildemo.response;

public class EmailResponse {

	private String messageResponse;

	public String getMessageResponse() {
		return messageResponse;
	}

	public void setMessageResponse(String messageResponse) {
		this.messageResponse = messageResponse;
	}

	@Override
	public String toString() {
		return "EmailResponse [messageResponse=" + messageResponse + "]";
	}	
}
