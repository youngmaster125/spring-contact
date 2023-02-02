package com.example.contacts.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@Entity
public class Contact implements  Serializable  {
@Id @GeneratedValue
private  Long id;
private String nom;
private String prenom;
@JsonFormat(pattern="yyyy-MM-dd")
private LocalDate DateNaisssance;
private String email;
private String tel;
private String photo;


public Contact() {
	super();
	// TODO Auto-generated constructor stub
}


public Contact(Long id, String nom, String prenom, LocalDate dateNaisssance, String email, String tel, String photo) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	DateNaisssance = dateNaisssance;
	this.email = email;
	this.tel = tel;
	this.photo = photo;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public LocalDate getDateNaisssance() {
	return DateNaisssance;
}


public void setDateNaisssance(LocalDate dateNaisssance) {
	DateNaisssance = dateNaisssance;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTel() {
	return tel;
}


public void setTel(String tel) {
	this.tel = tel;
}


public String getPhoto() {
	return photo;
}


public void setPhoto(String photo) {
	this.photo = photo;
}



}
