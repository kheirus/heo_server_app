package com.example.heo.model;

import java.io.Serializable;

import javax.persistence.Id;


public class User implements Serializable {

	
	private static final long serialVersionUID = -7133623716019644997L;
	
	@Id
	private String id;
	private String nom;
	private String prenom;
	private String mail;
	private String age;
	private String presentation;
	private String mdp;
	private String confirmMdp;

	public User() {
		
	}

	
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMail() {
		return mail;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getConfirmMdp() {
		return confirmMdp;
	}

	public void setConfirmMdp(String confirmMdp) {
		this.confirmMdp = confirmMdp;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

} 

