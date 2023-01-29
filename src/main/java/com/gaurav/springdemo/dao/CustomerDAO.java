package com.gaurav.springdemo.dao;

import java.util.List;

import com.gaurav.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
