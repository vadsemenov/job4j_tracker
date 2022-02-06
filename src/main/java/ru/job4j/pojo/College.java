package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        Date date = new Date(101010);
        student.setDateOfEntering(date);
        student.setFio("Ivan Ivanovich Ivanov");
        student.setGroup("StudentGroup");
        System.out.println("Студент: " + student.getFio() + " " + student.getGroup() + " " + student.getDateOfEntering());
    }
}
