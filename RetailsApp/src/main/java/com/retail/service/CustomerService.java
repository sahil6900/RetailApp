package com.retail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.Customer;
import com.retail.dao.CustomerDao;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	String type;
	double amt;
	double discount;
	double totalBill;
	
	
	public Customer createService(Customer customer) {
		
		type=customer.getCustomertype1();
		amt=customer.getAmount1();
		
		if(type.equalsIgnoreCase("regular")) {
			if(amt<5000) {
				customer.setDiscount(0);
				customer.setDiscountedRate(0);
				customer.setTotalBill(amt);
				
			}
			else if (amt>=5000 && amt<=10000) {
				customer.setDiscount(10);
				discount=amt*0.1;
				customer.setDiscountedRate(discount);
				totalBill=amt-discount;
				customer.setTotalBill(totalBill);
			}
			else if (amt>10000) {
				customer.setDiscount(20);
				discount=amt*0.2;
				customer.setDiscountedRate(discount);
				totalBill=amt-discount;
				customer.setTotalBill(totalBill);
			}
			this.customerDao.addDao(customer);
		}
		if (type.equalsIgnoreCase("premium")) {
			if (amt<=4000) {
				customer.setDiscount(10);
				discount=amt*0.1;
				customer.setDiscountedRate(discount);
				totalBill=amt-discount;
				customer.setTotalBill(totalBill);
				
			}
			else if (amt>4000 && amt<=8000) {
				customer.setDiscount(15);
				discount=amt*0.15;
				customer.setDiscountedRate(discount);
				totalBill=amt-discount;
				customer.setTotalBill(totalBill);
			}
			else if (amt>8000 && amt<12000) {
				customer.setDiscount(20);
				discount=amt*0.2;
				customer.setDiscountedRate(discount);
				totalBill=amt-discount;
				customer.setTotalBill(totalBill);
			}
			else if (amt>12000) {
				customer.setDiscount(30);
				discount=amt*0.3;
				customer.setDiscountedRate(discount);
				totalBill=amt-discount;
				customer.setTotalBill(totalBill);
			}
			this.customerDao.addDao(customer);
		}
		
		System.out.println(customer);
		
		return customer;
	}
}
