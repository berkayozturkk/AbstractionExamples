package org.berkayozturkk.flyer.driver;

import org.berkayozturkk.flyer.vehicle.Airplane;

public class Hangar {
	
	protected String name;

	public Hangar(String name) {
		super();
		this.name = name;
	}
	
	public void store(Airplane plane) {
		System.out.println("\nStroing the airplane: " + plane + " in " + name + " hangar.");
		plane.go();
		plane.takeOff();
		plane.land();
	}
	
	@Override
	public String toString() {
		return "Hangar [name=" + name + "]";
	}
	
	
	

}
