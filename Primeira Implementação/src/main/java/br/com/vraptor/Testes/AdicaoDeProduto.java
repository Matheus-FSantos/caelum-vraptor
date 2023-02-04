package br.com.vraptor.Testes;

import br.com.vraptor.Model.Produto;
import br.com.vraptor.Infra.ProdutoDAO;

public class AdicaoDeProduto {
	public static void main(String[] args) {
		Produto product = createProduct();
		
		new ProdutoDAO().save(product);
	}
	
	private static Produto createProduct() {
		Produto product = new Produto("Bola", "Bola da copa de 2002", 100.00);
		return product;
	}
}