package com.inheritance;


//Base Class
class Vehicle {
 String make;
 String model;
 int year;

 public Vehicle(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 void displayInfo() {
     System.out.println(make + " " + model + " " + year);
 }
}

//Derived Class: Car
class Car extends Vehicle {
 int numberOfDoors;

 public Car(String make, String model, int year, int numberOfDoors) {
     super(make, model, year);
     this.numberOfDoors = numberOfDoors;
 }

 void displayCarInfo() {
     System.out.println("Number of Doors: " + numberOfDoors);
 }
}

//Derived Class: Truck
class Truck extends Vehicle {
 int cargoCapacity;

 public Truck(String make, String model, int year, int cargoCapacity) {
     super(make, model, year);
     this.cargoCapacity = cargoCapacity;
 }

 void displayTruckInfo() {
     System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
 }
}

//Derived Class: Motorcycle
class Motorcycle extends Vehicle {
 boolean hasSidecar;

 public Motorcycle(String make, String model, int year, boolean hasSidecar) {
     super(make, model, year);
     this.hasSidecar = hasSidecar;
 }

 void displayMotorcycleInfo() {
     System.out.println("Has Sidecar: " + hasSidecar);
 }
}

//Main Class
public class Main {
 public static void main(String[] args) {

     // Car
     Vehicle car = new Car("Toyota", "Corolla", 2022, 4);
     car.displayInfo();
     ((Car) car).displayCarInfo();

     System.out.println();

     // Truck
     Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
     truck.displayInfo();
     ((Truck) truck).displayTruckInfo();

     System.out.println();

     // Motorcycle
     Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
     motorcycle.displayInfo();
     ((Motorcycle) motorcycle).displayMotorcycleInfo();
 }
}