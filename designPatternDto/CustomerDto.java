// CustomerDto.java
// ----------------
package com.sps.javaDesignPatternDto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String id;
    private final String firstName;
    private final String lastName;  // Fixed typo (was 'lasatName')

    public CustomerDto(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {  // Fixed typo (was 'getLasatName')
        return lastName;
    }
}
