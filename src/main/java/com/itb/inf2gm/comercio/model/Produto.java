package com.itb.inf2gm.comercio.model;

public class Produto {
 
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarra;
	private double preco;
	
	// public: Acesso liberado para todas as classes.
	// private: Acesso permitido apenas para os membros
	// da própria classe.
	// Entende-se por membros (atributos e ou métodos)
	
	// Métodos Setter's e Getter são responsáveis em atribuir e recuperar informações
	// dos atributos "RESPECTIVAMENTE"
	
	public void setId(Long id) {
		this.id = id;
	}
	 
	public Long getId() {
		return id;
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

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
