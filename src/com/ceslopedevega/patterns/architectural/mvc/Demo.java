package com.ceslopedevega.patterns.architectural.mvc;

import com.ceslopedevega.patterns.architectural.mvc.controller.StudentController;
import com.ceslopedevega.patterns.architectural.mvc.model.Student;
import com.ceslopedevega.patterns.architectural.mvc.view.StudentView;

/**
* Clase principal de la aplicación. Permite ejecutar el ejemplo mediante la función main
*
* @author Luis del Moral Martínez
*/
public class Demo {

	// Método principal de la aplicación. Crea el controlador y usa los métodos
	// públicos que tiene expuestos
	public static void main(String[] args) {
		StudentController controller = new StudentController(new StudentView());
		controller.updateView();
		
		// Se crea un nuevo usuario
		controller.addStudent(new Student("6", "Enrique García", "egarcia@edu.com"));
		controller.updateView();
		
		// Se borra un usuario
		controller.removeStudent(3);
		controller.updateView();
		
		// Se actualiza un usuario
		Student update = controller.getStudent(1);
		update.setName("Name updated!");
		controller.updateStudent(update, 1);
		controller.updateView();
	}
}
