package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student {
    @Autowired
    String name;
    List<Integer> grades = new ArrayList<>();
    @Autowired
    Predicate<Integer> rule;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public Student(String name, List<Integer> grades, Predicate<Integer> rule) {
        this.name = name;
        this.grades = grades.stream().filter(rule).collect(Collectors.toList());
        this.rule = rule;
    }

    public void addGrades(Integer... grades) {
        List<Integer> grs = Arrays.asList(grades);
        List<Integer> grs2 = grs.stream().filter(rule).toList();
        this.grades.addAll(grs2);
    }

    public void setRule(Predicate<Integer> rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

}
