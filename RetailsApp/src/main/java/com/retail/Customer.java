package com.retail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialNo;
	private String customertype1;
	private double amount1;
	private double discount;
	private double discountedRate;
	private double totalBill;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getCustomertype1() {
		return customertype1;
	}
	public void setCustomertype1(String customertype1) {
		this.customertype1 = customertype1;
	}
	public double getAmount1() {
		return amount1;
	}
	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getDiscountedRate() {
		return discountedRate;
	}
	public void setDiscountedRate(double discountedRate) {
		this.discountedRate = discountedRate;
	}
	
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public Customer(int serialNo, String customertype1, double amount1, double discount, double discountedRate) {
		super();
		this.serialNo = serialNo;
		this.customertype1 = customertype1;
		this.amount1 = amount1;
		this.discount = discount;
		this.discountedRate = discountedRate;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [serialNo=" + serialNo + ", customertype1=" + customertype1 + ", amount1=" + amount1
				+ ", discount=" + discount + ", discountedRate=" + discountedRate + ", totalBill=" + totalBill + "]";
	}
	
	
	
	
	
}
