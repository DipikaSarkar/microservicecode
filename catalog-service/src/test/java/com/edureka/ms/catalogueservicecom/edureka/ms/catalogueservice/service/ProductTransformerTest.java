package com.edureka.ms.catalogueservicecom.edureka.ms.catalogueservice.service;

import org.junit.jupiter.api.Test;

import com.edureka.ms.catalogueservice.model.Product;
import com.edureka.ms.catalogueservice.service.ProductService;

public class ProductTransformerTest {

	@Test
	public void shouldTrnsform() {
		ProductService.ProductDTO productDTO = new ProductService.ProductDTO();
		productDTO.setName("Dipika");
		productDTO.setDescription("Edureka");
		
		Product expectedProduct = Product.builder()
				.name("Dipika")
				.build();
				
		Product resultProduct =	new ProductService.ProductTransformer().transform(productDTO);
		
		
	}
}
