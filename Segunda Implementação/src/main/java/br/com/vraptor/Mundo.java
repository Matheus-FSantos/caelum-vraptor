package br.com.vraptor;

import java.util.List;
import java.util.ArrayList;

import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {
	public String boasVindas() {
		System.out.println("Entrei no boasVindas");
		return "olá mundo!!!";
	}
	
	public List<String> paises(){
		List<String> result = new ArrayList<String>();
		
		result.add("Brasil");
		result.add("França");
		result.add("Argentina");
		result.add("Espanha");
		result.add("Alemanha");
		result.add("Inglaterra");
		result.add("País de Gales");
		
		return result;
	}
}