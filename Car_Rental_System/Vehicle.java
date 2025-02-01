package Car_Rental_System;

public abstract class Vehicle {
	
	protected String vehicleId;
	protected VehicleType vehicleType;
	protected String company;
	protected double rentalCost;
	
	public Vehicle(String vehicleId, VehicleType vehicleType, String company, double rentalCost) {
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.company = company;
		this.rentalCost = rentalCost;
	}

	public abstract double calculateRentalCost(int duration);
	

}
