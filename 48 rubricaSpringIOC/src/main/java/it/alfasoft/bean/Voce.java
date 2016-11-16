package it.alfasoft.bean;

public class Voce {

	private String nome;
	private String telefono;

	public Voce() {

	}

	public Voce(String nome, String telefono) {
		this.nome = nome;
		this.telefono = telefono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
