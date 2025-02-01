package Car_Rental_System;

public class PaymentDetails {
	PaymentMode paymentMode;

	public PaymentDetails(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}
