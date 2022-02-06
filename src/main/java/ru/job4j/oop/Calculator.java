package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + minus(num) + divide(num);
    }

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        rsl = calculator.divide(5);
        System.out.println(rsl);
        rsl = minus(10);
        System.out.println(rsl);
        rsl = sum(10);
        System.out.println(rsl);
        rsl = calculator.sumAllOperation(10);
        System.out.println(rsl);
    }
}