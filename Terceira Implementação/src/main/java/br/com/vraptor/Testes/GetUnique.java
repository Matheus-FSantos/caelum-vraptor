package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProductDAO;
import br.com.vraptor.Infra.CreateSession;
import br.com.vraptor.Infra.CreateSessionFactory;

public class GetUnique {
	public static void main(String[] args) {
		System.out.println(new ProductDAO(new CreateSession(new CreateSessionFactory().getInstance()).getInstance()).getUnique(2L));
	}
}
