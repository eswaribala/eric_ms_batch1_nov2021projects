package com.eric.paymentapi.models;

import java.time.LocalDate;

public class Payment {

	private long orderId;
	private LocalDate orderDate;
	private long orderAmount;
	private boolean paymentStatus;
	private PaymentMode paymentMode;
}
