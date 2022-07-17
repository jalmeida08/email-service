package br.com.jsa.infra.validacao;

import br.com.jsa.api.dto.EmailDTO;

public class ValidaEnvioEmail {

	public static boolean validaDados(final EmailDTO dto) {
		if(dto.getListaComCopia().size() < 0)
			throw new IllegalArgumentException("Obrigatório pelo menos 1 destinatário");
		if(dto.getTitulo().length() < 2)
			throw new IllegalArgumentException("Obrigatório pelo menos 3 catacteres no título do e-mail");
		if(dto.getCorpoEmail().length() < 2)
			throw new IllegalArgumentException("Obrigatório pelo menos 3 catacteres no corpo do e-mail");
		return true;
	}

}
