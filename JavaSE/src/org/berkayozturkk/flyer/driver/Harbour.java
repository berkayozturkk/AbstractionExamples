package org.berkayozturkk.flyer.driver;

import org.berkayozturkk.flyer.vehicle.Floatable;

public class Harbour {
	
	protected String name;

	public Harbour(String name) {
		super();
		this.name = name;
	}
	
	public void enter(Floatable floatable) {
		System.out.println("\n" + floatable + " has entered the harbour: " + name);
	}
	
	@Override
	public String toString() {
		return "Harbour [name=" + name + "]";
	}
	
	
	

}
