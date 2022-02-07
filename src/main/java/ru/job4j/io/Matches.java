package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        String winer = "";
        int select;
        boolean turn = true;
        Scanner input = new Scanner(System.in);

        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3 && matches <= count) {
                turn = !turn;
                count -= matches;
                System.out.println("На столе осталось спичек " + count);
            } else {
                System.out.println("Ошибка! Вводите колличество от 1 до 3, и не больше оставшихся спичек");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}