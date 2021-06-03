package com.edureka.ms.catalogueservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.ms.catalogueservice.service.ProductService;
import com.edureka.ms.catalogueservice.service.ProductService.ProductDTO;

@RestController
public class ProductCatalogue {
	
	@Autowired 
	private ProductService productService;
	
	@GetMapping("/products")
	public List<ProductService.ProductDTO> getProducts() {
		return this.productService.getProducts();
	}
	

	@GetMapping("/products/name/{productName}")
	public List<ProductService.ProductDTO> getProductByName(@PathVariable String productName) {
		return this.productService.getProductsByName(productName);
	}
	
	
//	@PutMapping("/products")
//	public List<ProductService.ProductDTO> saveProduct(@RequestBody ProductDTO prouctDTO) {
//		return this.productService.getProductsByName(productName);
//	}
	
	
	@PostMapping("/products")
	public void createProduct(@RequestBody ProductDTO prouctDTO) {
		this.productService.saveProduct(prouctDTO);
	}
	
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable String id) {
		this.productService.remove(id);
	}
	
	
//	@GetMapping("/products/byBrand")
//	public List<ProductService.ProductDTO> getProductByBrand() {
//		List<ProductService.ProductDTO> prodByBrand = new ArrayList<>();
//		return prodByBrand;
//	}
//	@GetMapping("/products/priceByProductName")
//	public List<ProductService.ProductDTO> getProductByPrice() {
//		List<ProductService.ProductDTO> prodByPrice = new ArrayList<>();
//		return prodByPrice;
//	}
}
