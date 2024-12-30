// CustomerResource.java
// ---------------------
package com.sps.javaDesignPatternDto;

import java.util.List;

public class CustomerResource {
    private List<CustomerDto> customers;

    public CustomerResource(List<CustomerDto> customers) {
        this.customers = customers;
    }

    public List<CustomerDto> getAllCustomers() {  // Fixed method name (was 'getCustomers')
        return customers;
    }

    public void save(CustomerDto customer) {
        customers.add(customer);
    }

    public void delete(String customerId) {
        customers.removeIf(customer -> customer.getId().equals(customerId));
    }
}
