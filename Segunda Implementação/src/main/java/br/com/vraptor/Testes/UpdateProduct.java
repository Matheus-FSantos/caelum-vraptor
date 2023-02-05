package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProductDAO;

public class UpdateProduct {
	public static void main(String[] args) {
		new ProductDAO().update(3L, "Camiseta Suíça", "Camiseta oficial da Seleção da Suíça na WC", 349.99);
	}
}