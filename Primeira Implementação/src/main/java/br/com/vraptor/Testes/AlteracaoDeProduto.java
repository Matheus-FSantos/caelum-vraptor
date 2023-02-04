package br.com.vraptor.Testes;

import br.com.vraptor.Infra.ProdutoDAO;

public class AlteracaoDeProduto {
	public static void main(String[] args) {
		new ProdutoDAO().edit(5L, "Mesa", "Mesa de jantar", 100.00);
	}
}