package org.berkayozturkk.elevator.elevator3;

public class PrimitiveElevatorTest {
	
	public static void main(String[] args) {
		PrimitiveElevator primitiveElevator = new PrimitiveElevator();
		
		primitiveElevator.openDoor();
		primitiveElevator.openDoor();
		primitiveElevator.closeDoor();
		primitiveElevator.goDown();
		primitiveElevator.goUp();
		primitiveElevator.goUp();
		primitiveElevator.openDoor();
		primitiveElevator.closeDoor();
		primitiveElevator.goDown();
		primitiveElevator.openDoor();
		primitiveElevator.goDown();
		primitiveElevator.closeDoor();
		
		int curFloor = primitiveElevator.getCurrentFloor();
		
		if (curFloor != 5 && !primitiveElevator.isDoorOpen()) {
			primitiveElevator.go(5);
		}
		
		primitiveElevator.go(-1_000_000);
		primitiveElevator.openDoor();
	}

}
