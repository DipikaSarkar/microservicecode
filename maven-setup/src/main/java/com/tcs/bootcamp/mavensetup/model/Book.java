package com.tcs.bootcamp.mavensetup.model;

public class Book {
	
	public String title;
	public String author;
	
	public Book(String t, String a) {
		this.author = a;
		this.title = t;
	}
	
	
	public void printData() {
		System.out.println(title + author);
	}
}
