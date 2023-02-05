package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProductDAO;

public class DeleteProduct {
	public static void main(String[] args) {
		new ProductDAO().delete(1L);
	}
}
