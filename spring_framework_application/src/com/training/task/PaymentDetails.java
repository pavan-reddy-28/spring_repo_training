package com.training.task;

public class PaymentDetails {
private String transactionId;

public PaymentDetails() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "PaymentDetails [transactionId=" + transactionId + "]";
}

public String getTransactionId() {
	return transactionId;
}

public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}

}
