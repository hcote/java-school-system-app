package com.company;

public class Student {

    private int id;
    private String name;
    private String year;
    private int tuition;
    private int totalTuitionPaid = 0;

    public Student(int id, String name, String year, int tuition) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.tuition = tuition;
    }

    public void payTuition(int tuition) {
        School.updateMoneyEarned(tuition);
        totalTuitionPaid+=tuition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

}
