package com.ceslopedevega.patrones.creacionales.dependencyinjection.inventory;

/**
* Esta clase representa al servicio de inventario de la aplicación. 
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
	
	public String getName ()
	{
		return this.name;
	}
	
	public int getCapacity ()
	{
		return this.location.calculateInventoryCapacity();
	}
}
