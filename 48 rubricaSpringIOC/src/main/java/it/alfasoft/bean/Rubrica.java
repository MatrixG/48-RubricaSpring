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

	public void stampaTutteVoci() {
		for (Voce v : rubrica) {
			System.out.println(v.getNome() + " " + v.getTelefono());
		}
	}

	public Voce getVoceByName(String nome) {
		Voce out = null;
		for (Voce v : rubrica) {
			if (v.getNome().equals(nome)) {
				out = v;
				break;
			}
		}
		return out;
	}

}
