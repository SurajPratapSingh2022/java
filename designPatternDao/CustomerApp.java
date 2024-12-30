package com.sps.javaDesignPatternDao;

//CustomerApp.java
//-----------------

public class CustomerApp {
 public static void main(String[] args) {
     CustomerDAO customerDAO = new InMemoryCustomerDAOImpl();

     // Retrieve and display all customers
     System.out.println("All Customers:");
     customerDAO.getAllCustomers().forEach(System.out::println);

     // Add a new customer
     System.out.println("\nAdding a new customer:");
     Customer newCustomer = new Customer("3", "Lynda", "Blair");
     customerDAO.addCustomer(newCustomer);
     customerDAO.getAllCustomers().forEach(System.out::println);

     // Update a customer
     System.out.println("\nUpdating customer with ID 2:");
     Customer updatedCustomer = new Customer("2", "Alfonso", "Updated");
     customerDAO.updateCustomer(updatedCustomer);
     customerDAO.getAllCustomers().forEach(System.out::println);

     // Delete a customer
     System.out.println("\nDeleting customer with ID 1:");
     customerDAO.deleteCustomer("1");
     customerDAO.getAllCustomers().forEach(System.out::println);
 }
}
