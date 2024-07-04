package com.javaClassesAndObjects;

public class Car 
{

	//fields(variables)
	private String carColor;
	private String carModel;
	private int manufacturingYear;
	private double carPrice;
	private String acFeature;
	
	//default constructor : because no parameters are taken in constructor signature
	public Car()
	{
		//source then click on generate constructor using fields
	}

	public Car(String carColor, String carModel, int manufacturingYear, double carPrice, String acFeature)
	{
	
		this.carColor = carColor;
		this.carModel = carModel;
		this.manufacturingYear = manufacturingYear;
		this.carPrice = carPrice;
		this.acFeature = acFeature;
	}
	
	//behavior(method)
	//start
	public String startCar()
	{
		return "Car Started"; 
	}
	//stop
	public String stopCar()
	{
		return "Car Stopped";
	}
	public String moveCar()
	{
		return "Car Moving Forward";
	}
	public String reverseCar()
	{
		return "Car Moving Backward";
	}
	public void getCarDetails()
	{
		System.out.println(carColor);
		System.out.println(carModel);
		System.out.println(manufacturingYear);
		System.out.println(carPrice);
		System.out.println(acFeature);
	}
	
}


