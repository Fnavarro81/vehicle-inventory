package com.pluralsight;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Method to pull vehicles
        Vehicle[] vehicles = createVehicles();

        // Menu
        int command = 0;

        while (command != 5){
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Quit");
            System.out.println("Input 1-5: ");
            command = inputScanner.nextInt();
            inputScanner.nextLine();

            switch (command) {
                case 1 -> listAllVehicles(vehicles);
                case 2 -> findVehiclesByMakeModel(vehicles, inputScanner);
                case 3 -> findVehiclesByPriceRange(vehicles, inputScanner);
                case 4 -> findVehiclesByColor(vehicles, inputScanner);
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Command is invalid");
            }

        }
    }

    // Actual Method for Vehicles
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

    // Print all vehicles method
    public static void listAllVehicles(Vehicle[] vehicles) {
        int count = 6;

        for (int index = 0; index < count; index++) {
            System.out.println(vehicles[index]);
        }
    }

    // Method to find vehicle by make and model
    public static void findVehiclesByMakeModel(Vehicle[] vehicles, Scanner inputScanner){

        System.out.println("Enter make and model to search for: ");
        String searchMakeModel = inputScanner.nextLine();

        boolean found = false;

        for (Vehicle currentVehicle : vehicles){
            if (currentVehicle != null && currentVehicle.getMakeModel().equalsIgnoreCase(searchMakeModel)){
                System.out.println("Match found: " + currentVehicle);
                found = true;
            }
        }
        if (!found){
            System.out.println("No vehicles found matching: " + searchMakeModel);
        }

    }

    // Method to find vehicle by color
    public static void findVehiclesByColor(Vehicle[] vehicles, Scanner inputScanner){

        System.out.println("Enter color to search for: ");
        String searchColor = inputScanner.nextLine();

        boolean found = false;

        for (Vehicle currentVehicle : vehicles){
            if (currentVehicle != null && currentVehicle.getColor().equalsIgnoreCase(searchColor)){
                System.out.println("Match found: " + currentVehicle);
                found = true;
            }
        }
        if (!found){
            System.out.println("No vehicles found matching: " + searchColor);
        }

    }

    // Find vehicles by price range
    public static void findVehiclesByPriceRange(Vehicle[] vehicles, Scanner inputScanner){

        System.out.println("Enter minimum price: ");
        double minPrice = inputScanner.nextDouble();
        inputScanner.nextLine();

        System.out.println("Enter maximum price: ");
        double maxPrice = inputScanner.nextDouble();
        inputScanner.nextLine();

        System.out.println("\nSearching for vehicles between $" + minPrice + " and $" + maxPrice);

        boolean found = false;

        for (Vehicle vehicle : vehicles){
            if (vehicle != null && vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice){
                System.out.println(vehicle);
                found = true;
            }
        }
        if (!found){
            System.out.println("No vehicles found within that price range.");
        }
    }

}
