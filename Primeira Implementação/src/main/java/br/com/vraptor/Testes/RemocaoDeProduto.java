package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProdutoDAO;

public class RemocaoDeProduto {
	public static void main(String[] args) {
		new ProdutoDAO().delete(6L);
	}
}