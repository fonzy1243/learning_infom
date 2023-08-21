package com.infom.learning_infom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity()
public class Homeowner {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private int yearsAsHomeowner;
	private Date birthday;
	private char gender;
	private String email;
	private Long phoneNum;
	private String fbUrl;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
