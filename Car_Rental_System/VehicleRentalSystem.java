package Car_Rental_System;

import java.util.ArrayList;
import java.util.List;



public class VehicleRentalSystem {
	List<Store> storeList;
	List<User> userList;
	
	public VehicleRentalSystem() {
		this.storeList = new ArrayList<Store>();
		this.userList = new ArrayList<User>();
	}
	
	Store getStore(String location){
		for(Store store:storeList) {
			if(store.getLocation().equals(location)) {
				return store;
			}
		}
		return null;
	}
	
	void registerUser(User user){
		System.out.println("User : "+ user+"is registered");
		userList.add(user);
	}
	
	void addStore(Store store) {
		System.out.println("Store: "+store+" is added");
		storeList.add(store);
	}
	
	void unRegister(User user){
		userList.remove(user);
		System.out.println("User: "+user+" is removed");
	}
	
	void removeStore(Store store) {
		storeList.remove(store);
		System.out.println("Store: "+store+" is removed");
	}
	
}
