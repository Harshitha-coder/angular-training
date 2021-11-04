package com.xworkz.registeration.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterDTO {

	private int id;
	private String name;
	private String email;
	private String password;
	private String confirmPassword;
}
