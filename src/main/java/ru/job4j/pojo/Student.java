package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String fio;
    private String group;
    private Date dateOfEntering;

    public String getFio() {
        return fio;
    }

    public String getGroup() {
        return group;
    }

    public Date getDateOfEntering() {
        return dateOfEntering;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setDateOfEntering(Date dateOfEntering) {
        this.dateOfEntering = dateOfEntering;
    }
}
