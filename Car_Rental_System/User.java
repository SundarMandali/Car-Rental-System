package Car_Rental_System;

public class User {
	String userId;
	String userName;
	String driverLicense;
	
	public User(String userId, String userName, String driverLicense) {
		this.userId = userId;
		this.userName = userName;
		this.driverLicense = driverLicense;
	}
	
	public Reservation makeReservation(Store store,Vehicle vehicle,int duration,PaymentMode paymentMode){
		return store.createReservation(this, vehicle, duration, paymentMode);
	}
	
}
