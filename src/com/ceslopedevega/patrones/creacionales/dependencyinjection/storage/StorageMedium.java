package com.ceslopedevega.patrones.creacionales.dependencyinjection.storage;

import com.ceslopedevega.patrones.creacionales.dependencyinjection.inventory.Inventory;

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
