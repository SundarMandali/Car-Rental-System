package Car_Rental_System;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Store {
	int storeId;
	String location;
	List<Vehicle> vehicles;
	List<Reservation> reservations;

	public Store(String location){
		this.location=location;
		this.vehicles=new ArrayList<Vehicle>();
		this.reservations=new ArrayList<Reservation>();
	}

	void addVehicle(Vehicle vehicle){
		vehicles.add(vehicle);
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}


	public List<Reservation> getReservation() {
		return reservations;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservations = reservation;
	}
	
	Reservation createReservation(User user,Vehicle vehicle,int duration,PaymentMode paymentMode){
		Reservation reservation=new Reservation(UUID.randomUUID().toString(),user,vehicle,duration,paymentMode);
		reservations.add(reservation);
		return reservation;
	}

}
