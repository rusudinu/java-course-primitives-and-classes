package com.codingshadows.arraysclasses.vehicle;

/**
 * no need to do anything here
 */
public abstract class Vehicle implements Comparable<Vehicle> {
    private String colour;
    private boolean functional;

    public Vehicle() {
        this.colour = "Unknown";
        this.functional = true;
    }

    public Vehicle(String colour, boolean functional) {
        this.colour = colour;
        this.functional = functional;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFunctional() {
        return functional;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    public abstract double profit();

    public abstract void display();

    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(this.profit(), other.profit());
    }
}

