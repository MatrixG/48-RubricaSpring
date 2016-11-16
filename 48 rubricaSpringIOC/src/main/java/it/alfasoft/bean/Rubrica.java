package it.alfasoft.bean;

import java.util.List;

public class Rubrica {

	private String nome;
	private List<Voce> rubrica;

	public Rubrica() {

	}

	public Rubrica(String nome, List<Voce> rubrica) {

		this.nome = nome;
		this.rubrica = rubrica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Voce> getRubrica() {
		return rubrica;
	}

	public void setRubrica(List<Voce> rubrica) {
		this.rubrica = rubrica;
	}

	
}
