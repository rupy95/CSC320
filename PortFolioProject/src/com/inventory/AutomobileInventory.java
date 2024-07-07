package com.inventory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile car = new Automobile("Toyota", "Camry", "Red", 2020, 5000);

        try {
            String[] vehicleInfo = car.listVehicle();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }
            String removeResult = car.removeVehicle();
            System.out.println(removeResult);
            car.addVehicle("Honda", "Civic", "Blue", 2021, 3000);
            System.out.println("Vehicle added successfully.");
            vehicleInfo = car.listVehicle();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }
            String updateResult = car.updateVehicle("Ford", "Mustang", "Black", 2022, 1000);
            System.out.println(updateResult);
            vehicleInfo = car.listVehicle();
            for (String info : vehicleInfo) {
                System.out.println(info);
            }
            System.out.println("Do you want to print the information to a file? (Y or N)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                try (FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt")) {
                    for (String info : vehicleInfo) {
                        writer.write(info + "\n");
                    }
                    System.out.println("Information printed to file successfully.");
                } catch (IOException e) {
                    System.out.println("Failed to write to file: " + e.getMessage());
                }
            } else {
                System.out.println("A file will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
