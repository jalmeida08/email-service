package br.com.jsa.infra.factory;

import javax.mail.MessagingException;

import br.com.jsa.api.dto.EmailDTO;

public interface Email {

	public void envia(final EmailDTO emailDto) throws MessagingException;
	
}
