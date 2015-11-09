package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private List<Plane> planes = new ArrayList<>();
    private double totalCarrying;
    private double totalCapacity;

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void showCompany() {
        if (planes.isEmpty()) {
            System.out.println("Лист пуст");
        }
        for (Plane plane : planes) {
            System.out.println("Список самолетов компании : \n" + plane.toString());
        }
    }

    public void getTotalCarrying() {
        for (Plane plane : planes) {
            totalCarrying += plane.getCarrying();
        }
        System.out.println("Общая грузоподъемность самолетов компании : " + totalCarrying);
    }

    public void getTotalCapacity() {
        for (Plane plane : planes) {
            totalCapacity += plane.getCapacity();
        }
        System.out.println("Общая вместимость самолетов компании : " + totalCapacity);
    }

    public void sortPlaneFromCompany() {
        Collections.sort(planes, new DistanceComparator());

        System.out.println("Сортированный список самолетов : ");
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).getPlaneType() + " " + planes.get(i).getDistance());
        }
    }

    public void searchByParametr(double bottomParametr, double topParametr) {
        double distance;
        System.out.println("Поиск самолета по параметру \"Дальность полета\" (" + bottomParametr + "," + topParametr + ")");
        for (Plane plane : planes){
            distance = plane.getDistance();
            if(distance >= bottomParametr && distance <= topParametr){
                System.out.println(plane.getPlaneType() + " " + plane.getDistance());
            }
        }
    }
}
