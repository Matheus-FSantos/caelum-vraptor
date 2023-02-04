package br.com.vraptor.Infra;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.vraptor.Model.Produto;

public class ProdutoDAO {
	private final Session session;
	
	public ProdutoDAO() {
		this.session = new CreateSession().getSession();
	}
	
	/**
		Método para salvar um produto
	*/
	public void save(Produto product) {
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
	}
	
	/**
		Método para editar um produto existente
	*/
	public void edit(Long id, String nome, String descricao, Double preco) {
		Produto product = loadProduct(id);
		
		product.updateName(nome);
		product.updateDescricao(descricao);
		product.updatePrice(preco);
		
		Transaction transaction = session.beginTransaction();
		session.update(product);
		transaction.commit();
	}
	
	/**
		Método para deletar um produto existente
	*/
	public void delete(Long id) {
		Produto product = loadProduct(id);
		
		Transaction transaction = session.beginTransaction();
		session.delete(product);
		transaction.commit();
	}

	/**
		Método para carregar um produto existente
	*/
	private Produto loadProduct(Long id) {
		Produto product = (Produto) session.load(Produto.class, id);
		return product;
	}
}