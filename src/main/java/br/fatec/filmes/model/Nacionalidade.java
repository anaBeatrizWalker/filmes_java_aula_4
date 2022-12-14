package br.fatec.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Nacionalidade extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(length = 80)
	private String pais;
	
	public Nacionalidade() {}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}
