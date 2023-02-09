package br.com.vraptor.Testes;

import br.com.vraptor.Model.Product;
import br.com.vraptor.Infra.ProductDAO;
import br.com.vraptor.Infra.CreateSession;
import br.com.vraptor.Infra.CreateSessionFactory;

public class CreateProduct {
	public static void main(String[] args) {
		Product product = createProduct();
		
		new ProductDAO(new CreateSession(new CreateSessionFactory().getInstance()).getInstance()).post(product);
	}

	private static Product createProduct() {
		Product product = new Product("Bola", "Bola de futebol profissional da copa do mundo de 2002", 95.65);
		return product;
	}
}