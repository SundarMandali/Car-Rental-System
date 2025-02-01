package Car_Rental_System;

public class Car extends Vehicle{

	int numberOfSeats;

	

	public Car(String vehicleId,String company, double rentalCost,
			int numberOfSeats) {
		super(vehicleId, VehicleType.Car, company, rentalCost);
		this.numberOfSeats = numberOfSeats;
	}



	@Override
	public double calculateRentalCost(int duration) {
		return rentalCost*duration;
	}
	
}
