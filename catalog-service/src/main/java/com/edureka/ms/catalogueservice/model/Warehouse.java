package com.edureka.ms.catalogueservice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Warehouse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;
	
	private String name; 

	private BigDecimal quantity;

//	@ManyToOne
//	@JoinColumn(name="PRODUCTID")
//	private Product product;

}