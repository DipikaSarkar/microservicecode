package com.edureka.ms.catalogueservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the CUSTOMERLOGIN database table.
 * 
 */
@Entity
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	private String userPassword;

	/*
	@ManyToOne
	@JoinColumn(name="CUSTOMERID")
	private UserDetail userDetail;
	*/

}