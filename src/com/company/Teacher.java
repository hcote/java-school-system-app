package com.company;

public class Teacher {

    private int id;
    private String name;
    private int weeklySalary;
    private int totalSalaryPaid;

    public Teacher(int id, String name, int weeklySalary) {
        this.id = id;
        this.name = name;
        this.weeklySalary = weeklySalary;
        totalSalaryPaid = 0;
    }

    public void getPaid(int income) {
        School.updateMoneySpent(income);
        totalSalaryPaid+= income;
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

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public int getTotalSalaryPaid() {
        return totalSalaryPaid;
    }

}
