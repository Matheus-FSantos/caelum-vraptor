package io.github.MatheusFSantos.Configuration;

import io.github.MatheusFSantos.Model.Product;
import io.github.MatheusFSantos.Infra.ProductDAO;

public class AddProduct {
	public static void main(String[] args) {
		Product product = createProduct();
		
		new ProductDAO().save(product);
	}
	
	private static Product createProduct() {
		return new Product(null, "Toalha", "Toalha de banho vermelha (Adulto)", 799.99);
	}
}