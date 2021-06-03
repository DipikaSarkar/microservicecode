package com.edureka.ms.catalogueservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CARTLINEINFO database table.
 * 
 */
@Entity
public class Cartlineinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long cartlineinfoid;

	private BigDecimal quantity;

	private BigDecimal subtotal;

	/*//bi-directional many-to-one association to Cartinfo
	@OneToMany(mappedBy="cartlineinfo")
	private List<Cartinfo> cartinfos;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCTID")
	private Product product;*/

	
}