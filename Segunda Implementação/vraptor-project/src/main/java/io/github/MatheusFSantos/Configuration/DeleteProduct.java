package io.github.MatheusFSantos.Configuration;

import io.github.MatheusFSantos.Infra.ProductDAO;

public class DeleteProduct {
	public static void main(String[] args) {
		new ProductDAO().delete(2L);
	}
}