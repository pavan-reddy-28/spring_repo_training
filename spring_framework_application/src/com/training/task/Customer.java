package com.training.task;

import java.util.List;

public class Customer extends User {

	private String foreName;
	private String surName;
	private List<PaymentDetails> paymentDetails;
	private List<Bookable> favorities;
	private CustomerType customerType;
	
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Customer [foreName=" + foreName + ", surName=" + surName + ", paymentDetails=" + paymentDetails
				+ ", favorities=" + favorities + ", cutomerType=" + customerType + "]";
	}


	public String getForeName() {
		return foreName;
	}


	public void setForeName(String foreName) {
		this.foreName = foreName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public List<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}


	public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}


	public List<Bookable> getFavorities() {
		return favorities;
	}


	public void setFavorities(List<Bookable> favorities) {
		this.favorities = favorities;
	}


	public CustomerType getCustomerType() {
		return customerType;
	}


	public void setCutomerType(CustomerType customerType) {
		this.customerType = customerType;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
