package com.epam;

public class PassengerPlane extends Plane {
    private final static String planeType = "Passenger";
    public PassengerPlane(double carrying, double capacity, int distance) {
        super(planeType, carrying, capacity, distance);
    }
}
