package br.com.vraptor.Controllers;

import java.util.List;

import org.hibernate.Session;

import br.com.vraptor.Model.Product;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.vraptor.Infra.ProductDAO;

@Resource
public class ProductController {
	private ProductDAO productDAO;
	private Result result;
	
	public ProductController(ProductDAO productDAO, Result result) {
		this.productDAO = productDAO;
		this.result = result;
	}
	
	/**
	 * Método retorna todos os produtos existentes
	*/
	public List<Product> get(){
		return this.productDAO.get();
	}
	
	public void post(Product product) {
		this.productDAO.post(product);
		this.result.redirectTo(this).index();
	}
	
	public Product put(Long id) {
		return this.productDAO.loadProduct(id);
	}
	
	public void persistUpdate(Product product) {
		this.productDAO.put(product);
		this.result.redirectTo(this).get();
	}
	
	public void delete(Long id) {
		this.productDAO.delete(id);
		this.result.redirectTo(this).get();
	}
	
	public void index() {}
	public void form() {}
}