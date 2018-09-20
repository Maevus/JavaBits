package edu.negl.classes;

public class CarTester {
	/**
	 * Unit test for Car class. Tests that fuel consumed is correctly calculated based on an imputed fuel efficiency.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Car car = new Car(2);
		
		car.addGas(50);
		
		car.drive(10);
		
		System.out.println("Gas remaining in tank: " + car.getGasInTank());
		System.out.println("Expected: 45");
		
	}
}
