package com.tcs.bootcamp.mavensetup.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bootcamp.mavensetup.model.Book;
import com.tcs.bootcamp.mavensetup.model.Product;

@RestController
public class HelloWorldController {

	@GetMapping("/welcome")
	public String sayHi() {
		return "Hi There!";
	}
	
	@GetMapping("/current-time")
	public String currentTime() {
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   return dtf.format(now);  
	}
	
	
	@GetMapping("/product")
	public Product getProduct() {
		Product p = new Product();
		return p;
	}
	

	
	
	@GetMapping("/my-book")
	public Book getMyBook() {
		Book b1 = new Book("Java Book", "XYZ");
		return b1;
	}
}
