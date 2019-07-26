package com.db.designPatterns.factory;

public class carFactory {
public static Car buildCar(carType model){
	 Car car = null;
	 switch (model) {
	
	case SEDAN:
			car = new SedanCar(model);
			break;
	case LUXURY:
		car = new LuxuryCar(model);
			break;
	default:
		break;
	}
	 return car;
}
}
