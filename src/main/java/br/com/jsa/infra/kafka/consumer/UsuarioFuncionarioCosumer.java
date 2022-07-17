package br.com.jsa.infra.kafka.consumer;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.jsa.api.dto.EmailDTO;
import br.com.jsa.api.service.MensageriaService;

@Component
public class UsuarioFuncionarioCosumer {

	@Autowired
	private MensageriaService mensageriaService;
	
	@KafkaListener(topics = "${app.kafka.novo-usuario-funcionario.topic}", groupId = "${spring.kafka.consumer.group-id}")
	public void consumer(EmailDTO dto) throws MessagingException {
		System.out.println("INICIO :: ENVIANDO EMAIL ");
		mensageriaService.enviaEmail(dto);
		System.out.println(dto.toString());
	}
}
