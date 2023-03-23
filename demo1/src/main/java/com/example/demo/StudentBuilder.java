package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class StudentBuilder {
    static ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig1.class);


    static Student studentBuild(String s) {
        Student student = new Student(s);
        student.rule = (Predicate<Integer>) context.getBean("predicateBean");
        return student;
    }

    static Student studentBuild(String s, Integer... list) {
        Student student = new Student(s);
        student.rule = (Predicate<Integer>) context.getBean("predicateBean");
        student.addGrades(list);
        return student;
    }
}
