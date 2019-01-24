package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher john = new Teacher(1, "john", 2000);
        Teacher grant = new Teacher(2, "grant", 3000);
        List<Teacher> teacherArray = new ArrayList<>();

        teacherArray.add(john);
        teacherArray.add(grant);

        Student andy = new Student(1, "andy", "freshman", 20000);
        Student bob = new Student(2, "bob", "sophomore", 22000);
        List<Student> studentArray = new ArrayList<>();

        studentArray.add(andy);
        studentArray.add(bob);

        School schoolOne = new School(teacherArray, studentArray);
        andy.payTuition(20000);
        bob.payTuition(100);

        System.out.println(schoolOne.getMoneyEarned());
        john.getPaid(2000);
        System.out.println(schoolOne.getMoney());
    }
}
