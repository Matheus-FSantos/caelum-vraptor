package br.com.vraptor.Testes;

import br.com.vraptor.Model.Product;
import br.com.vraptor.Infra.ProductDAO;

public class CreateProduct {
	public static void main(String[] args) {
		Product product = createProduct();
		
		new ProductDAO().save(product);
	}

	private static Product createProduct() {
		Product product = new Product("Bola", "Bola de futebol profissional da copa do mundo de 2002", 95.65);
		return product;
	}
}