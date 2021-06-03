package com.edureka.ms.catalogueservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;




@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode

@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String brand;

	private String price;

	private String name;

//	@OneToMany(mappedBy="product")
//	private List<Cartlineinfo> cartlineinfos;
//
//
//	@ManyToOne
//	@JoinColumn(name="CATEGORYID")
//	private Category category;
//
//
//	@OneToMany(mappedBy="product")
//	private List<Warehouse> warehouses;

}