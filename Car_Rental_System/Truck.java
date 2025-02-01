package Car_Rental_System;

public class Truck extends Vehicle{
	double loadCapacity;
	
	public Truck(String vehicleId, String company, double rentalCost, double loadCapacity) {
		super(vehicleId, VehicleType.Truck, company, rentalCost);
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double calculateRentalCost(int duration) {
		return rentalCost*duration;
	}
	
}
