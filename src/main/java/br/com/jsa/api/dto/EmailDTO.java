package br.com.jsa.api.dto;

import java.util.List;

public class EmailDTO {

	private List<String> listaDestinatario;
	private List<String> listaComCopia;
	private String titulo;
	private String corpoEmail;

	public EmailDTO() {}

	public EmailDTO(List<String> listaDestinatario, List<String> listaComCopia, String titulo,
			String corpoEmail) {
		this.listaDestinatario = listaDestinatario;
		this.listaComCopia = listaComCopia;
		this.titulo = titulo;
		this.corpoEmail = corpoEmail;
	}

	public String[] getListaDestinatarioString() {
		return this.listaDestinatario
				.toArray(new String[this.listaDestinatario.size()]);
	}

	public String[] getListaComCopiaString() {
		return this.listaComCopia
				.toArray(new String[this.listaComCopia.size()]);
	}

	public void setListaDestinatario(List<String> listaDestinatario) {
		this.listaDestinatario = listaDestinatario;
	}

	public void setListaComCopia(List<String> listaComCopia) {
		this.listaComCopia = listaComCopia;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCorpoEmail(String corpoEmail) {
		this.corpoEmail = corpoEmail;
	}

	public List<String> getListaDestinatario() {
		return listaDestinatario;
	}

	public List<String> getListaComCopia() {
		return listaComCopia;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCorpoEmail() {
		return corpoEmail;
	}

	@Override
	public String toString() {
		return "EmailDTO [\n"
				+ "listaDestinatario=" + listaDestinatario + ",\n"
				+ "listaComCopia=" + listaComCopia + ",\n"
				+ "titulo=" + titulo + ",\n"
				+ "corpoEmail=" + corpoEmail + "\n"
			+ "]";
	}
	
}
