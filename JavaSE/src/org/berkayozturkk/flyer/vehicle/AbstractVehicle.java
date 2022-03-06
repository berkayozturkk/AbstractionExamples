package org.berkayozturkk.flyer.vehicle;

public abstract class AbstractVehicle implements Vehicle {
	
	protected String name;

	public AbstractVehicle(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AbstractVehicle [name=" + name + "]";
	}

}
