package com.sps.javaDesignPatternDao;

//CustomerDAO.java
//-----------------

import java.util.List;

public interface CustomerDAO {
 List<Customer> getAllCustomers();
 Customer getCustomerById(String id);
 void addCustomer(Customer customer);
 void updateCustomer(Customer customer);
 void deleteCustomer(String id);
}
