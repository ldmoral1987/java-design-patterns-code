package com.ceslopedevega.patterns.architectural.mvc.model;

/**
* Esta clase contiene el tipo de dato primitivo de la aplicación
* Este objeto podría configurarse con anotaciones ORM
* para vincularlo a un modelo de una base de datos. No obstante,
* en este ejemplo no usaremos conexiones externas a fuentes de datos.
*
* @author Luis del Moral Martínez
*/
public class Student {
	// Datos personales del estudiante
	private String id;
	private String name;
	private String mail;

	public Student (String id, String name, String mail)
	{
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String toString()
	{
		return "ID: " + getId() + ", NAME: " + getName() + ", MAIL: " + getMail();
	}
}
