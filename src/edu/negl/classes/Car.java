package edu.negl.classes;

public class Car {
	
	int efficiency;
	int fuelInTank;
	
	/**
	 * Constructor for the car class, efficiency is given in l/Km
	 */
	public Car(int carEfficiency) {
		
		fuelInTank = 0;
		efficiency = carEfficiency;
			
	}
	
	/**
	 * Assessor method which returns amount of gas in tank.
	 * @return returns the amount of gas in the tank
	 */
	
	public int getGasInTank()
	{
		return fuelInTank;
	}
	
	/**
	 * Simulates driving the car for a certain distance, reducing the available fuel in tank accordingly.
	 * @param distance is the amount of distance the car has covered as an int.
	 */
	public void drive(int distance)
	{
		fuelInTank = fuelInTank - (distance/efficiency);
	}
	
	/**
	 * Adds gas to the gas instance variable
	 * @param gas takes amount of gas to add as an int.
	 */
	public void addGas(int gas)
	{
		fuelInTank = fuelInTank + gas;
	}
	
}
