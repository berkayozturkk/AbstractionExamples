package org.berkayozturkk.shape;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		super("Circle" , -1);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the circle.");
	}

	@Override
	public void erase() {
		System.out.println("Erasing the circle.");
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	

}
