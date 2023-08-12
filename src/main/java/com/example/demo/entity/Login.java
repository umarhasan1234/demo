package com.example.demo.entity;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@AllArgsConstructor
@NoArgsConstructor
@Table(name="loginPage")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="passwords")
	private String password;
	
	@Column(name="agree")
	private Boolean terms;
	
}
