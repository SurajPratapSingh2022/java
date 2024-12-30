package com.sps.javaDesignPatternDao;

//InMemoryCustomerDAOImpl.java
//----------------------------


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryCustomerDAOImpl implements CustomerDAO {
 private List<Customer> customers = new ArrayList<>();

 public InMemoryCustomerDAOImpl() {
     // Adding some initial customers
     customers.add(new Customer("1", "Kelly", "Brown"));
     customers.add(new Customer("2", "Alfonso", "Bass"));
 }

 @Override
 public List<Customer> getAllCustomers() {
     return new ArrayList<>(customers);
 }

 @Override
 public Customer getCustomerById(String id) {
     Optional<Customer> customer = customers.stream()
             .filter(c -> c.getId().equals(id))
             .findFirst();
     return customer.orElse(null);
 }

 @Override
 public void addCustomer(Customer customer) {
     customers.add(customer);
 }

 @Override
 public void updateCustomer(Customer customer) {
     for (Customer c : customers) {
         if (c.getId().equals(customer.getId())) {
             c.setFirstName(customer.getFirstName());
             c.setLastName(customer.getLastName());
             break;
         }
     }
 }

 @Override
 public void deleteCustomer(String id) {
     customers.removeIf(c -> c.getId().equals(id));
 }
}
