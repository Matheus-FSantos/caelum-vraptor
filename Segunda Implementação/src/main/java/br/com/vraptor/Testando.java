package br.com.vraptor;

import br.com.caelum.vraptor.Resource;

@Resource
public class Testando {
	public String teste() {
		System.out.println("Entrei");
		return "Deu certo, olá mundo, VRaptor funcionando normalmente!!!";
	}
}