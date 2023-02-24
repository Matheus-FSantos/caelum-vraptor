package io.github.MatheusFSantos.Configuration;

import io.github.MatheusFSantos.Infra.ProductDAO;

public class GetProduct {
	public static void main(String[] args) {
		System.out.println(new ProductDAO().findById(1L).toString());
	}
}