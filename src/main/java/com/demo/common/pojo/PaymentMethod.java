package com.demo.common.pojo;

public class PaymentMethod {

	private Card card;
	private Check check;
	private Paypal paypal;
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Check getCheck() {
		return check;
	}
	public void setCheck(Check check) {
		this.check = check;
	}
	public Paypal getPaypal() {
		return paypal;
	}
	public void setPaypal(Paypal paypal) {
		this.paypal = paypal;
	}
	
	
}
