package com.codingshadows.arraysclasses.vehicle;

import java.util.Arrays;

public class BusStation {
    private Vehicle[] vehicles;
    private int count;

    public BusStation(int capacity) {
        vehicles = new Vehicle[capacity];
        count = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (count < vehicles.length) {
            vehicles[count++] = vehicle;
        } else {
            System.out.println("Bus station is full!");
        }
    }

    /**
     * TODO: Implement the showTotalProfit method
     * It should return the total profit of all vehicles in the station
     */
    public double showTotalProfit() {
        double totalProfit = 0;
        for (int i = 0; i < count; i++) {
            // fill in the code here
        }
        System.out.println("Total Profit: " + totalProfit);
        return totalProfit;
    }

    /**
     * TODO: Implement the sortVehicles method
     */
    public void sortVehicles() {

    }

    public Vehicle[] getVehicles() {
        return Arrays.copyOf(vehicles, count);
    }

    public int getCount() {
        return count;
    }
}

