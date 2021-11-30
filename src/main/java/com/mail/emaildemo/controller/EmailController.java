package com.mail.emaildemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.mail.emaildemo.exception.EmailException;
import com.mail.emaildemo.request.EmailRequest;
import com.mail.emaildemo.response.EmailResponse;
import com.mail.emaildemo.response.PingResponse;
import com.mail.emaildemo.service.EmailService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/send-email")
	public ResponseEntity<EmailResponse> sendMail(@RequestBody EmailRequest emailRequest) {

		try {
			emailService.sendMail(emailRequest);
			EmailResponse response = new EmailResponse();
			response.setMessageResponse("Email sent successfully!");
			return new ResponseEntity<EmailResponse>(response, HttpStatus.OK);
		}
		catch (EmailException exc) {
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "Error Not Found", exc);
		}

	}

	@GetMapping("/ping")
	public ResponseEntity<PingResponse> ping() {
		PingResponse ping = new PingResponse();
		ping.setTestPing("true");
		return new ResponseEntity<PingResponse>(ping, HttpStatus.OK);
	}
}


