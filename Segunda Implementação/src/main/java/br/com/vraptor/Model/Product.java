package br.com.vraptor.Model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	private Double price;
	
	public Product(String name, String description, Double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public Product() {
		
	}
	
	public String toString() {
		return "Id: " + this.getId() + 
			   "\nProduct: " + this.getName() +
			   "\nDescription: " + this.getDescription() +
			   "\nValue: " + this.getPrice();
	}

	public Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public void updateName(String name) {
		this.setName(name);
	}

	public String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}
	
	public void updateDescription(String description) {
		this.setDescription(description);
	}

	public Double getPrice() {
		return price;
	}

	protected void setPrice(Double price) {
		this.price = price;
	}
	
	public void updatePrice(Double price) {
		this.setPrice(price);
	}
}