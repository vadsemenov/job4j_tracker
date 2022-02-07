package ru.job4j.oop;

public class Move {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = {bus, train, airplane};

        for (var vehicle : vehicles) {
            vehicle.move();
        }
    }
}