package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.function.Predicate;


public class BeanConfig2 {
    @Bean
    @Scope("prototype")
    Student studentBean(String name, List<Integer> grades, Predicate predicateBean) {
        return new Student(name, grades, predicateBean);
    }
}
