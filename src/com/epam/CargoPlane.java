package com.epam;

public class CargoPlane extends Plane {
    private final static String planeType = "Cargo";
    public CargoPlane(double carrying, double capacity, int distance) {
        super(planeType, carrying, capacity, distance);
    }
}
