package com.xworkz.thymeleafcrudwebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "employee_table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="E_ID")
	private int id;
	@Column(name="E_NAME")
	private String name;
	@Column(name="E_EMAIL")
	private String email;
	@Column(name="E_LOCATION")
	private String location;
	@Column(name="E_DESIGNATION")
	private String designation;
}
