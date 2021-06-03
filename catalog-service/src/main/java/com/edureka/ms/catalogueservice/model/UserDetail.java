package com.edureka.ms.catalogueservice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the CUSTOMERDETAILS database table.
 * 
 */
@Entity
@Table(name="user_details")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long customerid;

	private String address;

	private String customername;

	private String email;

	private BigDecimal phonenumber;


	/*
	@OneToMany(mappedBy="userDetail")
	private List<Cartinfo> cartinfos;


	@OneToMany(mappedBy="userDetail")
	private List<UserEntity> users;

	*/
}