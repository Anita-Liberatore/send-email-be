package com.mail.emaildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mail.emaildemo.exception.EmailException;
import com.mail.emaildemo.request.EmailRequest;
import com.mail.emaildemo.response.EmailResponse;
import com.mail.emaildemo.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/send-email")
	public ResponseEntity<EmailResponse> sendMail(@RequestBody EmailRequest emailRequest) {

		try {
			emailService.sendMail(emailRequest);
			EmailResponse response = new EmailResponse();
			response.setMessageResponse("Email sent successfully!!");
			return new ResponseEntity<EmailResponse>(response, HttpStatus.OK);
		}
		catch (EmailException exc) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Foo Not Found", exc);
		}

	}
}

