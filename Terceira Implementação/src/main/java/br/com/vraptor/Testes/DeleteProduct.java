package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProductDAO;
import br.com.vraptor.Infra.CreateSession;
import br.com.vraptor.Infra.CreateSessionFactory;

public class DeleteProduct {
	public static void main(String[] args) {
		new ProductDAO(new CreateSession(new CreateSessionFactory().getInstance()).getInstance()).delete(1L);
	}
}
