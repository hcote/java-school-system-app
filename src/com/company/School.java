package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int moneyEarned;
    private static int moneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        moneyEarned = 0;
        moneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getMoneyEarned() {
        return  moneyEarned;
    }

    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }

    public static int updateMoneyEarned(int income) {
        return moneyEarned+=income;
    }

    public static int updateMoneySpent(int costs) {
        return moneySpent+=costs;
    }

    public int getMoney() {
        return moneyEarned - moneySpent;
    }


}
