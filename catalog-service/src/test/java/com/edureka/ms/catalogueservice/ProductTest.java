package com.edureka.ms.catalogueservice;

import org.junit.jupiter.api.Test;

import com.edureka.ms.catalogueservice.model.Product;

public class ProductTest {
	
	@Test
	public void shouldUseGetterSetter() {
		Product product = new Product();
		product.setName("Biscut");
		product.getName();
		new Product();
		
		Product productBuilder = Product.builder().name("Apple").build();
		System.out.println(product);
		System.out.println(productBuilder);
		
	
	}

}
