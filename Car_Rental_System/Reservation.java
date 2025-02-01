package Car_Rental_System;

import java.util.UUID;

public class Reservation {
	String reservationId;
	User user;
	Vehicle vehicle;
	int duration;
	Payment payment;
	
	public Reservation(String reservationId, User user, Vehicle vehicle, int duration, PaymentMode paymentMode) {
		this.reservationId=reservationId;
		this.user=user;
		this.vehicle=vehicle;
		this.duration=duration;
		this.payment=new Payment(UUID.randomUUID().toString(),vehicle.calculateRentalCost(duration),"Pending",new PaymentDetails(paymentMode));
	}
	
	public void confirmReservation() {
		this.payment.payBill();
	}
}
