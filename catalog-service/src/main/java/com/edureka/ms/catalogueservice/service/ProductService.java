package com.edureka.ms.catalogueservice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.ms.catalogueservice.model.Product;
import com.edureka.ms.catalogueservice.reporsitory.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository repository;
		
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	@ToString
	@EqualsAndHashCode
	
	public static class ProductDTO {		
		String name;
		String description;
	}
	
	public static class ProductTransformer {
		
		public Product transform(ProductDTO productDTO) {
			return Product.builder().name(productDTO.getName()).brand(productDTO.getDescription()).build();
		}

		public ProductDTO transform(Product product) {
			return ProductDTO.builder().name(product.getName()).description(product.getBrand()).build();
		}
		
		private List<ProductDTO> transform(List<Product> productList) {
			List<ProductDTO> productDTOList = new ArrayList<>();
			for (Iterator<Product> iterator = productList.iterator(); iterator.hasNext();) {
				Product product = (Product) iterator.next();
				ProductDTO productDTO = transform(product);
				productDTOList.add(productDTO);
			}
			return productDTOList;
		}
		
	}

	public List<ProductDTO> getProducts() {
		List<Product> productList = repository.findAll();
		return new ProductTransformer().transform(productList);
	}

	

	public List<ProductDTO> getProductsByName(String name) {
		List<Product> productList = repository.findByName(name);
		return new ProductTransformer().transform(productList);
	}


	public void saveProduct(ProductDTO prouctDTO) {
		repository.save(new ProductTransformer().transform(prouctDTO));
	}

	public void remove(String id) {
		repository.deleteById(Long.parseLong(id));
	}
}
