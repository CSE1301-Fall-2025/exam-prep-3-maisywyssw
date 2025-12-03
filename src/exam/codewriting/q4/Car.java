package exam.codewriting.q4;

/*
 * We wish to create a Car class. A Car has-a(n):
 * 
 * Odometer, which tracks how many miles the car has been driven.
 * Fuel efficiency, typically given as miles-per-gallon.
 * Fuel tank, which can hold some amount of fuel, in gallons.
 * Current amount of fuel.
 */

public class Car {

	// Declare your instance variables here:
	private double odometer;
	private double fuelEfficiency;
	private double fuelTank;
	private double amountFuel;
	// Write the constructor fo
	//r the Car class:
	public Car(double fuelEfficiency, double fuelTank){
		this.fuelEfficiency = fuelEfficiency;
		this.fuelTank = fuelTank;
		this.odometer = 0;
		this.amountFuel = 0;
	}
	// (For full credit the constructor should use only two parameters)
	
	/**
	* Drives the car at the given speed for the given amount of time or until out of fuel.
	* (Hint: Carefully consider the impact of driving to all instance variables).
	*/
	public void drive ( double milesPerHour , double hours ) {
		double maxDistance = amountFuel * fuelEfficiency;
		double distance = milesPerHour*hours;
		
		if (distance > maxDistance){
			odometer += maxDistance;
			amountFuel = 0;

		}
		else {
			odometer += distance;
			amountFuel -= fuelEfficiency/distance;
		}

	
		
	}
	
	public double getMilesDriven () {
		return this.odometer;
	}
	
	/**
	* Adds fuel to the tank as long as it does not exceed the tank�s capacity.
	* @return portion of fuel that couldn�t be added
	*/
	public double addFuel ( double gallons ) {
		if (gallons + amountFuel>fuelTank) {
			double fuelAttempt = gallons + amountFuel;
			amountFuel = fuelTank;
			return (fuelAttempt) - fuelTank;
		}
		else {
			amountFuel += gallons;
			return 0;
		}
	}
	
	
}
