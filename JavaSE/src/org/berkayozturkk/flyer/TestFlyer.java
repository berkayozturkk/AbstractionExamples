package org.berkayozturkk.flyer;

import org.berkayozturkk.flyer.driver.*;
import org.berkayozturkk.flyer.vehicle.*;
import org.berkayozturkk.flyer.animal.*;

import java.util.*;

public class TestFlyer {
	
	public static void main(String[] args) {
		SeaPlane seaPlane = new SeaPlane("Berkay's SeaPlane");
		Floatable floatabla = seaPlane;
		Airplane airplane = seaPlane;
		AbstractVehicle abstractVehicle = seaPlane;
		Vehicle vehicle = seaPlane;
		Flyer flyer = seaPlane;
		Object obj = seaPlane;
		
		
		Pilot pilot = new Pilot("Berkay");
		pilot.drive(seaPlane);
		
		Hangar hangar = new Hangar("Hangar s");
		hangar.store(seaPlane);
		
		Harbour harbour = new Harbour("Istanbul harbour");
		harbour.enter(seaPlane);
		
		List list = new ArrayList();
		
		list.add(seaPlane);
		
		UniversalDriver universalDriver = new UniversalDriver("Berkay");
		universalDriver.drive(seaPlane);
	}

}
