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
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode

@Entity
@Table(name="orders")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long orderid;

	@Temporal(TemporalType.DATE)
	private Date orderdate;

	private String orderstatus;

	private BigDecimal total;

	//bi-directional many-to-one association to Cartinfo
//	@ManyToOne
//	@JoinColumn(name="CARTINFOID")
//	private Cartinfo cartinfo;


}