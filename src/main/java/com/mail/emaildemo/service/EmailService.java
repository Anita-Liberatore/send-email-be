package com.mail.emaildemo.service;

import com.mail.emaildemo.request.EmailRequest;

public interface EmailService {

	void sendMail(EmailRequest email);

}
