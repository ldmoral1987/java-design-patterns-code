package com.ceslopedevega.patrones.creacionales.dependencyinjection;

import com.ceslopedevega.patrones.creacionales.dependencyinjection.inventory.*;
import com.ceslopedevega.patrones.creacionales.dependencyinjection.storage.*;

/**
* Clase principal de la aplicación. Permite ejecutar el ejemplo mediante la función main
*
* @author Luis del Moral Martínez
*/
public class Demo {

	public static void main(String[] args) {
		// Se configuran diferenets ubicaciones de inventario. En el constructor
		// se inyectan las diferentes dependencias
		InventoryLocation sevilla = new InventoryLocation ("Sevilla", new StorageLarge(150, 3, 2));
		InventoryLocation cordoba = new InventoryLocation ("Córdoba", new StorageMedium(50, 2));
		InventoryLocation malaga = new InventoryLocation ("Málaga", new StorageSmall(15));
		
		// Se obtienen y se muestran los valores de capacidad total de cada ubicación.
		System.out.println("Total capacity of site " + sevilla.getName() + ": " + sevilla.getCapacity());
		System.out.println("Total capacity of site " + cordoba.getName() + ": " + cordoba.getCapacity());
		System.out.println("Total capacity of site " + malaga.getName() + ": " + malaga.getCapacity());
	}

}
