package br.com.jsa.infra.factory;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import br.com.jsa.api.dto.EmailDTO;
import br.com.jsa.infra.validacao.ValidaEnvioEmail;

public class EmailFactory implements Email{

	private JavaMailSender mailSender;
	
	public EmailFactory(final JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	private void emailHelper(final EmailDTO dto) throws MessagingException {
		MimeMessage mail = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mail);
		helper.setTo(dto.getListaDestinatarioString());
		helper.setCc(dto.getListaComCopiaString());
		helper.setSubject(dto.getTitulo());
		helper.setText(dto.getCorpoEmail(), true);
		
		this.mailSender.send(mail);		
	}
	
	@Override
	public void envia(EmailDTO emailDto) throws MessagingException {
		if(ValidaEnvioEmail.validaDados(emailDto))
			this.emailHelper(emailDto);
	}

}
