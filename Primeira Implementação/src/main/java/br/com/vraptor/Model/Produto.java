package br.com.vraptor.Model;

import javax.persistence.*;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String descricao;
	private Double preco;
	
	public Produto(String nome, String descricao, Double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto() {
		
	}
	
	@Override
	public String toString() {
		return "Id: " + this.getId() +
			   "\nProduto: " + this.getNome() +
			   "\nDescricao: " + this.getDescricao() +
			   "\nPreco: " + this.getPreco();
	}
	
	public void updateName(String nome) {
		this.setNome(nome);
	}
	
	public void updatePrice(Double preco) {
		this.setPreco(preco);
	}
	
	public void updateDescricao(String descricao) {
		this.setDescricao(descricao);
	}

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	protected void setPreco(Double preco) {
		this.preco = preco;
	}
}