package org.berkayozturkk.shape;

public class Rectangle extends Shape {
	private double shortSide;
	private double longSide;

	public Rectangle(double shortSide, double longSide) {
		super("Rectangle", 4);
		this.longSide = longSide;
		this.shortSide = shortSide;
	}
	
	@Override
	public double calculateArea() {
		return shortSide * longSide;
	}
	
	@Override
	public double calculateCircumference() {
		return shortSide + longSide;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing the rectangle.");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing the rectangle.");
	}

}
