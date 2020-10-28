package com.ceslopedevega.patrones.creacionales.dependencyinjection.inventory;

/**
* Esta clase representa al servicio de inventario de la aplicación. La clase admite
* como ubicación de localización a cualquier objeto que implemente la interfaz
* Inventory
*
* @author Luis del Moral Martínez
*/
public class InventoryLocation {
	private Inventory location;
	private String name;
	
	public InventoryLocation (String name, Inventory location)
	{
		this.name = name;
		this.location = location;
	}
	
	/**
	* Devuelve el nombre de la ubicación del inventario
	*/
	public String getName ()
	{
		return this.name;
	}
	
	/**
	* Devuelve la capacidad de la ubicación del inventario
	*/	
	public int getCapacity ()
	{
		return this.location.calculateInventoryCapacity();
	}
}
