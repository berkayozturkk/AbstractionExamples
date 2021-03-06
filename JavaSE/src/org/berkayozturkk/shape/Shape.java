package org.berkayozturkk.shape;

public abstract class Shape implements Drawable,Erasable {
	
	private String name;
	private int numberOfSides;
	
	public Shape(String name, int numberOfSides) {
	//	super();
		this.name = name;
		this.numberOfSides = numberOfSides;
	}
	
	public abstract double calculateArea();
	public abstract double calculateCircumference();
	
	public String getName() {
		return name;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	@Override
	public String toString() {
		return "Shape [name=" + name + ", numberOfSides=" + numberOfSides + "]";
	}
	
	
	

}
