package com.epam;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Input input = new Input();
        Company company = input.inputManual();

        company.showCompany();
        company.getTotalCarrying();
        company.getTotalCapacity();
        company.sortPlaneFromCompany();
        input.limitParametr();
    }
}
