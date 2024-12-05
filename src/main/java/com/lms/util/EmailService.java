
package com.lms.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;


@Component
public class EmailService {
	
	@Autowired
	private JavaMailSenderImpl JavaMailSender;
	
	
	public void sendEmail(String to, String sub, String msg) {
		
		SimpleMailMessage s= new SimpleMailMessage();

		s.setTo(to);
		s.setSubject(sub);
		s.setText(msg);

		JavaMailSender.send(s);
		

}
}
