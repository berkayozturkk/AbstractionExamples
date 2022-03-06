package org.berkayozturkk.elevator.elevator4;

public class EncapsulatedElevatorTest {

	public static void main(String args[]) {

		EncapsulatedElevator encapElevator = new EncapsulatedElevator();

		encapElevator.openDoor(); // Get into the elevator
		encapElevator.goDown();
		encapElevator.goUp();
		encapElevator.goUp();
		encapElevator.closeDoor();
		encapElevator.openDoor(); // Somebody is coming :)
		encapElevator.goDown();
		encapElevator.goDown();
		encapElevator.goDown();
		encapElevator.go(Floor.FOURTH);

	}
}