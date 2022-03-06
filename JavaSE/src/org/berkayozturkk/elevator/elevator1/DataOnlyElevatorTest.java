package org.berkayozturkk.elevator.elevator1;


public class DataOnlyElevatorTest {
	
	static DataOnlyElevator publicElevator = new DataOnlyElevator();
	static boolean stopped = false;
	
	
	public static void main(String[] args) {
		printElevatorState();
		publicElevator.doorOpen = true;
		
		publicElevator.doorOpen = false;
		printElevatorState();
		
		publicElevator.currentFloor = 4879468;
		publicElevator.doorOpen = true;
		
		printElevatorState();
		publicElevator.doorOpen = false;
		
		publicElevator.currentFloor = -15; 
		printElevatorState();
		publicElevator.doorOpen = true; 
		publicElevator.currentFloor++; 
		printElevatorState();

		
		
	}
	
	public static void printElevatorState() {
		String doorStatusString = "CLOSED";
		if(publicElevator.doorOpen) {
			doorStatusString = "OPEN";		
		}
		
		System.out.println("Elevator is at floot " + publicElevator.currentFloor + " and the door is " + doorStatusString);
	}
	
}
