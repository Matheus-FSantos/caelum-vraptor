package io.github.MatheusFSantos.Resource;

import java.util.List;

import com.google.inject.Inject;

import br.com.caelum.vraptor.Resource;
import io.github.MatheusFSantos.Infra.ProductDAO;
import io.github.MatheusFSantos.Model.Product;

@Resource
public class ProductController {
	
	@Inject
	private ProductDAO productDAO;
	
	public List<Product> findAll(){
		return productDAO.findAll();
	}
	
	public Product findById() {
		return productDAO.findById(1L);
	}
	
	public String index() { return "Olá Mundo, Olá VRaptor"; }
}