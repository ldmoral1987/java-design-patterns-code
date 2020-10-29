package com.ceslopedevega.patterns.architectural.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
* Esta clase contiene el modelo de datos de la aplicación.
* En lugar de conectarnos a una BBDD, representamos la colección
* como una lista de estudiantes. Sobre esta lista se realizará
* el CRUD (create, read, update y delete).
*
* @author Luis del Moral Martínez
*/
public class StudentModel {
	List<Student> students = new ArrayList<Student>();
	
    // Añade un estudiante al modelo
	public void addStudent (Student student)
	{
		students.add(student);
	}
	
	// Devuelve un estudiante del modelo de datos
	public Student getStudent (int i)
	{
		return students.get(i);
	}
	
	// Devuelve todos los estudiantes del modelo
	public List<Student> getAllStudents ()
	{
		return students;
	}
	
	// Borra un estudiante del modelo de datos
	public void removeStudent (int i)
	{
		students.remove(i);
	}
	
	// Actualiza un estudiante del modelo de datos
	public void updateStudent (Student student, int i)
	{
		students.set(i,  student);
	}
}
