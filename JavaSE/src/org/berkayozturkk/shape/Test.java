package org.berkayozturkk.shape;

public class Test {
	
	public static void main(String[] args) {
		Geometry geometry = new Geometry();
		
//		Shape shape = new Rectangle(3, 4);
//		System.out.println("\nName: " + shape.getName() + " and number of sides: " + shape.getNumberOfSides());
//		geometry.drawShape(shape);
		
		for (int i = 0; i < 9; i++) {
			Shape shape = ShapeFactory.produceShape();
			System.out.println("Name: " + shape.getName());
			System.out.println(shape.toString());
			System.out.println(shape.getName() + " Shape Calculate Area: " +shape.calculateArea());
			geometry.drawShape(shape);
			geometry.eraseShape(shape);
			
			System.out.println();
		}
	}

}
