package com.db.designPatterns.factory;

public abstract class Car {
	private carType model;
	private location location;
	
	public Car(carType model, carType location) {
		this.setModel(model);
		this.setLocation(location);
		
		// TODO Auto-generated constructor stub
	}
	public abstract void construct();
	public carType getModel() {
		return model;
	}
	public void setModel(carType model) {
		this.model = model;
	}
	public location getLocation() {
		return location;
	}
	public void setLocation(location location) {
		this.location = location;
	}
}
