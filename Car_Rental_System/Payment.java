package Car_Rental_System;

public class Payment {

	String paymentId;
	double amount;
	String status;
	PaymentDetails paymentDetails;
	
	public Payment(String paymentId, double amount, String status, PaymentDetails paymentDetails) {
		this.paymentId=paymentId;
		this.amount=amount;
		this.status=status;
		this.paymentDetails=paymentDetails;
	}

	public void payBill() {
		this.status= "Paid";
	}

}
