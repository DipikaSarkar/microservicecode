package com.edureka.ms.catalogueservice.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode

@Entity
public class Cartinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private BigDecimal total;

	/*@ManyToOne
	@JoinColumn(name="CARTLINEINFOID")
	private Cartlineinfo cartlineinfo;


	@ManyToOne
	@JoinColumn(name="CUSTOMERID")
	private UserDetail userDetail;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="cartinfo")
	private List<Order> orders;*/

}