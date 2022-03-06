package org.berkayozturkk.flyer.driver;

public abstract class AbstractDriver implements Driver {
	
	protected String name;

	public AbstractDriver(String name) {
		super();
		this.name = name;
	}
}