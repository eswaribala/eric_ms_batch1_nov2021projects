package com.eric.orderapi.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Order {

	private long orderId;
	private LocalDate orderDate;
	private long orderAmount;
}
