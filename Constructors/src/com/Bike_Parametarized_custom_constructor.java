package com;

class Bike_Parametarized_custom_constructor {
	Bike_Parametarized_custom_constructor (int cost)
	{
		System.out.println("cost:"+cost);
	}

	public static void main(String[] args) {
		Bike_Parametarized_custom_constructor b=new Bike_Parametarized_custom_constructor (45000);
		
	}

}
