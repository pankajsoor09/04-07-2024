package com.javaClassesAndObjects;

public class TestCarClass 
{

	public static void main(String[] args)
	{
 
		Car car1 = new Car("Black", "Kia Seltos", 2023, 1490232.67, "Yes");
		Car car2 = new Car("White", "Mahindra Scarpio", 2022, 2590232.67, "Yes");
		Car car3 = new Car("Red", "TATA Nexon", 2021, 1290232.67, "Yes");
		

		System.out.println("----------------car-1 details----------------");
		
		car1.getCarDetails();
		
		System.out.println("----------------car started----------------");
		System.out.println(car1.startCar());
		
		System.out.println("----------------car stoped----------------");
		System.out.println(car1.stopCar());
		
		System.out.println("----------------car-2 details----------------");
		car2.getCarDetails();
		System.out.println(car2.moveCar());
		
		System.out.println("----------------car-3 details----------------");
		car3.getCarDetails();
		System.out.println(car3.reverseCar());

	}

}
