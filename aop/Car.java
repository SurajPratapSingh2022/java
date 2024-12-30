package com.sps.javaAop;

//Car.java (OOP Example)
public class Car {
 private String brand;
 private int speed;

 // Constructor
 public Car(String brand) {
     this.brand = brand;
     this.speed = 0;
 }

 // Method to accelerate the car
 public void accelerate(int increment) {
     speed += increment;
     System.out.println(brand + " is now going at " + speed + " km/h.");
 }

 // Method to brake the car
 public void brake(int decrement) {
     speed -= decrement;
     if (speed < 0) speed = 0;
     System.out.println(brand + " slowed down to " + speed + " km/h.");
 }

 // Main method to test the Car class
 public static void main(String[] args) {
     Car myCar = new Car("Toyota");
     myCar.accelerate(50);
     myCar.brake(20);
 }
}
