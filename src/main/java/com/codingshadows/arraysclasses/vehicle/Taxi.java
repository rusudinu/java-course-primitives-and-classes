package com.codingshadows.arraysclasses.vehicle;

/**
 * TODO:
 * extend the Vehicle class
 * create the noPassengers and ticketPrice fields
 * the profit is calculated as follows: noPassengers * ticketPrice * 0.25
 */
public class Taxi {

    @Override
    public void display() {
        System.out.println("Taxi - Colour: " + getColour() + ", Functional: " + isFunctional() +
                ", Passengers: " + noPassengers + ", Ticket Price: " + ticketPrice);
    }
}

