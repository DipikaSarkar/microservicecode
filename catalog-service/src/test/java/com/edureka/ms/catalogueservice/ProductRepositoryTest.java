package com.edureka.ms.catalogueservice;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.edureka.ms.catalogueservice.model.Product;
import com.edureka.ms.catalogueservice.reporsitory.ProductRepository;

@DataJpaTest
public class ProductRepositoryTest {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	public void shouldSaveAProduct() {
		Product product = Product.builder()
						.name("some name")
						.build();
		productRepository.save(product);
		List<Product> allProduct = productRepository.findAll();
		Assertions.assertThat(allProduct.stream().findFirst().get()).isNotEqualTo(allProduct);
	}
	
}
