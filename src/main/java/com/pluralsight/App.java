package com.pluralsight;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Vehicle[] vehicles = createVehicles();

        //listAllVehicles(vehicles);

        int command = 0;

        while (command != 5){
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Quit");
            command = inputScanner.nextInt();
            inputScanner.nextLine();
            switch (command) {
                case 1 ->  listAllVehicles(vehicles);
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Command is invalid");
            }


        }
    }

    private static Vehicle[] createVehicles() {
        Vehicle[] vehicles = new Vehicle[20];

        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 9700);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        return vehicles;
    }

    public static void listAllVehicles(Vehicle[] vehicles) {
        int count = 6;

        for (int index = 0; index < count; index++) {
            System.out.println(vehicles[index]);
        }
    }
}
