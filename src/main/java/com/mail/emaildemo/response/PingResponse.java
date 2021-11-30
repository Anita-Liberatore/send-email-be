package com.mail.emaildemo.response;

public class PingResponse {

	private String testPing;

	public String getTestPing() {
		return testPing;
	}

	public void setTestPing(String testPing) {
		this.testPing = testPing;
	}

	@Override
	public String toString() {
		return "PingResponse [testPing=" + testPing + "]";
	}	
}
