package com.ceslopedevega.patterns.creational.dependencyinjection.storage;

import com.ceslopedevega.patterns.creational.dependencyinjection.inventory.Inventory;

/**
* Esta clase representa a una ubicación de almacenamiento mediano, compuesta por un edificio
* formado por una serie de plantas y cada planta con un tamaño de almacenaje.
*
* @author Luis del Moral Martínez
*/
public class StorageMedium implements Inventory {

	private int goods;
	private int floors;
	
	public StorageMedium (int goods, int floors)
	{
		this.goods = goods;
		this.floors = floors;
	}
	
	/**
	* Este método, que se implementa debido a la interfaz Inventory, calcula
	* el espacio de almacenamiento (plantas * espacio)
	*/
	@Override
	public int calculateInventoryCapacity() {
		return goods * floors;		
	}
}
