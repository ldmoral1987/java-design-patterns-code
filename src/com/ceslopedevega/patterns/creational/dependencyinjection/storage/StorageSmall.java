package com.ceslopedevega.patterns.creational.dependencyinjection.storage;

import com.ceslopedevega.patterns.creational.dependencyinjection.inventory.Inventory;

/**
* Esta clase representa a una ubicación de almacenamiento pequeño, compuesta por un edificio
* de una única planta con su espacio de almacenamiento limitado.
*
* @author Luis del Moral Martínez
*/
public class StorageSmall implements Inventory {

	private int goods;
	
	public StorageSmall (int goods)
	{
		this.goods = goods;
	}
	
	/**
	* Este método, que se implementa debido a la interfaz Inventory, calcula
	* el espacio de almacenamiento (espacio)
	*/
	@Override
	public int calculateInventoryCapacity() {
		return goods;		
	}
}
