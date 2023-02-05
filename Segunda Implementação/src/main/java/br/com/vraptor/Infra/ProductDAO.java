package br.com.vraptor.Infra;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.vraptor.Model.Product;

public class ProductDAO {
	private final Session session;
	
	public ProductDAO() {
		session = new CreateSession().getSession();
	}
	
	public void save(Product product) {
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
	}
	
	public void update(Long id, String newName, String newDescription, Double newPrice) {
		Product product = loadProduct(id);
		
		product.updateName(newName);
		product.updateDescription(newDescription);
		product.updatePrice(newPrice);
		
		Transaction transaction = session.beginTransaction();
		session.update(product);
		transaction.commit();
	}
	
	public void delete(Long id) {
		Product product = loadProduct(id);
		
		Transaction transaction = session.beginTransaction();
		session.delete(product);
		transaction.commit();
	}
	
	public String get(Long id) {
		Product product = loadProduct(id);
		
		return product.toString();
	}

	private Product loadProduct(Long id) {
		Product product = (Product) session.load(Product.class, id);
		
		return product;
	}
}