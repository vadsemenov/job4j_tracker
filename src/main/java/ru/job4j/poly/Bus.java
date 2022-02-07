package ru.job4j.poly;

import java.sql.SQLOutput;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Number of passengers:" + count);
    }

    @Override
    public double fillTheCar(double fuel) {
        return fuel * 50.2;
    }
}
