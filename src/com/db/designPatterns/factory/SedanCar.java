package com.db.designPatterns.factory;

public class SedanCar extends Car {

	public SedanCar(carType model,location location)
	{
		super(carType.SEDAN,location);
		System.out.println("sc const");
	}
	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("sc created");
	}

}
