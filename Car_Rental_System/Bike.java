package Car_Rental_System;

public class Bike extends Vehicle{

	boolean hasHelmet;
	

	public Bike(String vehicleId, String company, double rentalCost, boolean hasHelmet) {
		super(vehicleId, VehicleType.Bike, company, rentalCost);
		this.hasHelmet = hasHelmet;
	}


	@Override
	public double calculateRentalCost(int duration) {
		return rentalCost*duration;
	}

}
