package br.com.vraptor.Infra;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.vraptor.Model.Product;

@Component
public class ProductDAO {
	private final Session session;
	
	public ProductDAO(Session session) {
		this.session = session;
	}
	
	public List<Product> get() {
		return this.session.createCriteria(Product.class).list();
	}
	
	public String getUnique(Long id) {
		Product product = loadProduct(id);
		
		return product.toString();
	}
	
	public void post(Product product) {
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
	}
	
	public void put(Product product) {
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

	public Product loadProduct(Long id) {
		Product product = (Product) session.load(Product.class, id);
		
		return product;
	}
}