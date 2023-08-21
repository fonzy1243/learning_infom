package com.infom.learning_infom;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "homeowners")
public class Homeowner {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "full_name")
	private String name;
	@Column(name = "years_as_homeowner")
	private int yearsAsHomeowner;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "gender")
	private char gender;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_number")
	private Long phoneNum;
	@Column(name = "facebook_url")
	private String fbUrl;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsAsHomeowner() {
		return yearsAsHomeowner;
	}

	public void setYearsAsHomeowner(int yearsAsHomeowner) {
		this.yearsAsHomeowner = yearsAsHomeowner;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getFbUrl() {
		return fbUrl;
	}

	public void setFbUrl(String fbUrl) {
		this.fbUrl = fbUrl;
	}
}
