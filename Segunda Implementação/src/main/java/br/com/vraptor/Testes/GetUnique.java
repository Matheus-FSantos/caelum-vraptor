package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProductDAO;

public class GetUnique {
	public static void main(String[] args) {
		System.out.println(new ProductDAO().get(2L));
	}
}
