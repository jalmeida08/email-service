package br.com.jsa.infra.kafka.consumer.usuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NovoUsuarioFuncionarioErroConsumer {

	private final Logger logger = LoggerFactory.getLogger(NovoUsuarioFuncionarioErroConsumer.class);
	
	@Value("${app.kafka.consumer.usuario.erro-novo-usuario-funcionario.topic}")
	private String erroNovoUsuarioFuncionario;
	
	
	@KafkaListener(
			topics="${app.kafka.consumer.usuario.erro-novo-usuario-funcionario.topic}",
			groupId = "${app.kafka.consumer.usuario.erro-novo-usuario-funcionario.group-id}"
			)
	public void consumer() {
		logger.info("INICIO :: ENVIANDO EMAIL DE FEEDBACK" + erroNovoUsuarioFuncionario);
		logger.info("IMPLEMENTACAO DE ENVIO DO EMAIL DE ERRO AO USUÀRIO QUE INSERIU O NOVO FUNCIONÁRIO, A SER CONSTRUÍDO...");
		logger.info("FIM :: ENVIANDO EMAIL DE FEEDBACK");
	}
	
}
