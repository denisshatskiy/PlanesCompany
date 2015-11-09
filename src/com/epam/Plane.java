package com.epam;

abstract class Plane{
    private String planeType;
    private Double carrying;
    private Double capacity;
    private Integer distance;

    public Plane (String planeType, Double carrying, Double capacity, Integer distance){
        this.planeType = planeType;
        this.carrying = carrying;
        this.capacity = capacity;
        this.distance = distance;
    }

    public String toString(){
        return ("Тип самолeта : " + planeType + ", грузоподъемность : " + carrying
                + ", вместимость : " + capacity + ", дальность полета : " + distance);
    }

    public String getPlaneType(){
        return planeType;
    }

    public double getCarrying(){
        return carrying;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getDistance(){
        return distance;
    }
}