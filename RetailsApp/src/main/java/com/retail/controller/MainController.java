package com.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.retail.Customer;
import com.retail.service.CustomerService;

@Controller
public class MainController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(path ="/processcustomer",method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute Customer customer,Model model) {
		
		model.addAttribute(customer);
		System.out.println(customer);
		
		Customer createService = this.customerService.createService(customer);
		System.out.println(createService);
		return "success";
	}
}
