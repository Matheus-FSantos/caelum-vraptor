package io.github.MatheusFSantos.Infra;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import io.github.MatheusFSantos.Model.Product;

public class ProductDAO {
	private Session session;
	
	public ProductDAO() {
		this.session = new CreateSession().getSession();
	}
	
	public List<Product> findAll() {
		List<Product> products = session.createCriteria(Product.class).list();
		
		return products;
	}
	
	public Product findById(Long id) {
		return this.loadProduct(id);
	}
	
	public void save(Product product) {
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
	}
	
	public void update(Long id) {
		Product product = this.loadProduct(id);
		
		product.updateName("Teste");
		product.updateDescription("Testando a product dao");
		product.updatePrice(1999.99);
		
		this.persistUpdate(product);
	}
	
	public void delete(Long id) {
		Product product = this.loadProduct(id);

		Transaction transaction = session.beginTransaction();
		session.delete(product);
		transaction.commit();
	}
	
	public void persistUpdate(Product product) {
		Transaction transaction = session.beginTransaction();
		session.update(product);
		transaction.commit();
	}
	
	public Product loadProduct(Long id) {
		return session.load(Product.class, id);
	}
}