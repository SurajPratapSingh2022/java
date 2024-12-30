package com.sps.javaDesignPatternDao;

//Customer.java
//-------------

public class Customer {
 private String id;
 private String firstName;
 private String lastName;

 public Customer(String id, String firstName, String lastName) {
     this.id = id;
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Getters and setters
 public String getId() {
     return id;
 }

 public void setId(String id) {
     this.id = id;
 }

 public String getFirstName() {
     return firstName;
 }

 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }

 public String getLastName() {
     return lastName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }

 @Override
 public String toString() {
     return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
 }
}