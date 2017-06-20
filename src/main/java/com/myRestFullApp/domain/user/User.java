package com.myRestFullApp.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "user")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Column(name = "nombre", length = 50)
	 private String nombre;
	 @Column(name = "apellido", length = 50)
	 private String apellido;
	 @Column(name = "password", length = 60)
	 private String password;
	 @Email
	 @Column(length = 100, unique = true)
	 private String email;
	 
	 public User() {
		// TODO Auto-generated constructor stub
	}
	 
	 public User(String nombre, String apellido, String password, String email){
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.password = password;
		 this.email = email;
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	 @Override
	public String toString() {
	return "User{" +
			"nombre='" + nombre + '\'' +
			", apellido='" + apellido + '\'' +
			", password='" + password + '\'' +
			", email='" + email + '\'' +
			"}";
	 }

}
