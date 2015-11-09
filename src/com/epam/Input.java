package com.epam;

import java.util.Scanner;

public class Input {
    Company company = new Company();
    public Company inputManual(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число самолетов компании : ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i ++){
            System.out.println("Укажите тип самолета (P  - passenger или C - cargo): ");
            String planeType = scanner.next();
            switch (planeType) {
                case "P": {
                    System.out.println("Введите параметры carrying , capacity, distance, каждый раз нажимая Enter : ");
                    PassengerPlane passengerPlane = new PassengerPlane(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
                    company.addPlane(passengerPlane);
                    break;
                }
                case "C": {
                    System.out.println("Введите параметры carrying , capacity, distance, каждый раз нажимая Enter : ");
                    CargoPlane cargoPlane = new CargoPlane(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
                    company.addPlane(cargoPlane);
                    break;
                }
            }
        }
        return company;
    }

    public void limitParametr(){
        double bottomParametr, topParametr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите нижний параметр для поиска по дальности : ");
        bottomParametr = scanner.nextDouble();
        System.out.println("Введите верхний параметр для поиска по дальности : ");
        topParametr = scanner.nextDouble();

        company.searchByParametr(bottomParametr, topParametr);
    }
}
