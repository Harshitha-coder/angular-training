package com.xworkz.airlines.entity;

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
@Table(name="airlines_table")
@Getter
@Setter
@NoArgsConstructor
public class AirlinesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="A_id")
	private int id;
	@Column(name="A_NAME")
	private String name;
	@Column(name="A_OWNER")
	private String owner;
	@Column(name="A_NATIONALITY")
	private String nationality;
	@Column(name="A_CONTACT")
	private String contact;
	@Column(name="A_HB")
	private String headBranch;
	@Column(name="A_NOOFSUBBRANCH")
	private String noOfSubBranch;
	
}
