package com.codingshadows.arraysclasses.doctor;

/**
 * no need to do anything here
 */
public class Doctor {
    protected String name;

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor: " + name;
    }
}
