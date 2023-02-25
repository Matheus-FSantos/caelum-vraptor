package io.github.MatheusFSantos.Configuration;

import io.github.MatheusFSantos.Infra.ProductDAO;

public class UpdateProduct {
	public static void main(String[] args) {
		new ProductDAO().update(1L);
	}
}