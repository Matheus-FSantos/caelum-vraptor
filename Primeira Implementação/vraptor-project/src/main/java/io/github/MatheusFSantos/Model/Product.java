package io.github.MatheusFSantos.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 120)
	private String name;
	
	@Column(nullable = false, length = 180)
	private String description;
	
	@Column(nullable = false)
	private Double price;

	public Product() {
	}

	public Product(Long id, String name, String description, Double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return "Product [id = " + id + ", name = " + name + ", description = " + description + ", price = " + price + "]";
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