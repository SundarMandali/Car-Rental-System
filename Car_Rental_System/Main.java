package Car_Rental_System;

public class Main {

	public static void main(String[] args) {
		VehicleRentalSystem system=new VehicleRentalSystem();
		Store store=new Store("Hyderabad");
		system.addStore(store);
		
		Car car=new Car("C1","Toyota",1000,4);
		store.addVehicle(car);
		
		User user=new User("12","Sundar","DL125680");
		system.registerUser(user);
		
		Reservation reservation=user.makeReservation(store, car, 3, PaymentMode.CASH);
		reservation.confirmReservation();
		
		System.out.println("Reservation confirmed for " + reservation.duration + " days using " + reservation.payment.paymentDetails.getPaymentMode());
	}

}
