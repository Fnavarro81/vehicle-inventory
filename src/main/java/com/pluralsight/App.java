package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];

        // Vehicles
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 9700);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangel", "Yellow", 30000, 16000);

        int count = 6;
        System.out.println(vehicles[0]);
    }

}
