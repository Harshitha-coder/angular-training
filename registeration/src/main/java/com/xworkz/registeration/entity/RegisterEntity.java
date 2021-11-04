package com.xworkz.registeration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RegisterEntity {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
}
