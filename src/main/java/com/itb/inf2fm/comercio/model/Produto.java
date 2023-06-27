package com.itb.inf2fm.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setProco(double proco) {
		this.preco = proco;
	}
	
	public void setCodStatus(boolean codStatus) {
		this.codStatus = codStatus;
	}
	public boolean getCodStatus() {
		return codStatus;
	}
	// public : acesso liberado para todas as classes.
	// private: acesso permite apenas os membros
	//			da propria classe
	//			esntende-se por membros(atributos e ou metodos)
	
	
}
