package com.edureka.ms.catalogueservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.edureka.ms.catalogueservice.reporsitory.ProductRepository;
import com.edureka.ms.catalogueservice.service.ProductService;

public class ProductServiceTest {
	
	ProductService productService;
	
	@BeforeEach()
	public void before() {
		productService = new ProductService();
		productService.repository = Mockito.mock(ProductRepository.class);
		
	}

	@Test
	public void shouldSaveProductDTO() {
		ProductService.ProductDTO productDTO = new ProductService.ProductDTO();
		productDTO.setName("");
		productDTO.setDescription("");
//		boolean saved = productService.save(productDTO);
//		
//		Assertions.assertThat(saved).isTrue();
//		Mockito.verify(productService.repository, Mockito.times(1)).save(Mockito.any());
	}
}
