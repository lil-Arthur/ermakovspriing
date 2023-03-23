package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student {
    String name;
    List<Integer> grades = new ArrayList<>();
    Predicate rule;

    public Student(String name, List<Integer> grades, Predicate rule) {
        this.name = name;
        this.grades = (List<Integer>) grades.stream().filter(rule).collect(Collectors.toList());
        this.rule = rule;
    }

    public void addGrades(Integer... grades) {
        List<Integer> grs = Arrays.asList(grades);
        List<Integer> grs2 = (List<Integer>) grs.stream().filter(rule).collect(Collectors.toList());
        this.grades.addAll(grs2);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
