package com.db.designPatterns.factory;

public class LuxuryCar extends Car {
	
	@Override
	public String toString()
	{
		return "LuxuryCar[]";
	}
	public LuxuryCar(carType model,location location)
	{
		super(carType.LUXURY,location);
		System.out.println("lc const");
	}
	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("lc created");
	}

}
