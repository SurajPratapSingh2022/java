// CustomerClientApp.java
// ----------------------
package com.sps.javaDesignPatternDto;

import java.util.ArrayList;
import java.util.List;

public class CustomerClientApp {
    public static void main(String[] args) {
        List<CustomerDto> customers = new ArrayList<>();
        CustomerDto customerOne = new CustomerDto("1", "Kelly", "Brown");
        CustomerDto customerTwo = new CustomerDto("2", "Alfonso", "Bass");
        customers.add(customerOne);
        customers.add(customerTwo);

        CustomerResource customerResource = new CustomerResource(customers);  // Fixed variable name (was 'customerResources')
        System.out.println("All Customers:");
        List<CustomerDto> allCustomers = customerResource.getAllCustomers();  // Fixed method call (was 'customerResource.getCustomers')
        printCustomerDetails(allCustomers);

        System.out.println("------------------------");
        System.out.println("Deleting Customer with id(1)");
        customerResource.delete(customerOne.getId());  // Fixed variable name (was 'customerResouce')
        allCustomers = customerResource.getAllCustomers();  // Fixed variable name (was 'cutomerResource')
        printCustomerDetails(allCustomers);

        System.out.println("------------------------");
        System.out.println("Adding Customer three");
        CustomerDto customerThree = new CustomerDto("3", "Lynda", "Blair");
        customerResource.save(customerThree);  // Fixed variable name (was 'customerResorce')
        allCustomers = customerResource.getAllCustomers();
        printCustomerDetails(allCustomers);
    }

    private static void printCustomerDetails(List<CustomerDto> allCustomers) {
        allCustomers.forEach(customer -> System.out.println(customer.getFirstName()));
    }
}
