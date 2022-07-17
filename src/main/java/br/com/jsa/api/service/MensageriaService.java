package br.com.jsa.api.service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.jsa.api.dto.EmailDTO;
import br.com.jsa.infra.factory.EmailFactory;

@Service
public class MensageriaService {
	
	@Autowired
	private JavaMailSender mailSender;

	public void enviaEmail(EmailDTO dto) throws MessagingException {
		var factory = new EmailFactory(mailSender);
		factory.envia(dto);
	}
}
