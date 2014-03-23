package com.senacrs.agenda;

public class Lista {
	private String nome;
	private String fone;
	Lista prox;
	
	public Lista(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Lista getProx() {
		return prox;
	}

	public void setProx(Lista prox) {
		this.prox = prox;
	}
	
}
