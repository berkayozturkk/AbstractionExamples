package org.berkayozturkk.flyer.animal;

public abstract class Animal {
	
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Animal is eating.s");
	}

}
