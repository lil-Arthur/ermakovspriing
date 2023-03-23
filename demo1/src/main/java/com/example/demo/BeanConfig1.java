package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.*;
import java.util.function.Predicate;

public class BeanConfig1 {

    @Bean
    String stringBean() {
        return "hello world!";
    }
    @Bean
    int randomBean(int minBean, int maxBean) {
        return new Random().nextInt(minBean, maxBean);
    }
    @Bean
    @Lazy
    Date dateBean() {
        Date date = new Date();
        return date;
    }
    @Bean
    Predicate<Integer> predicateBean() {
        return x -> x<=5 && x>=2;
    }
    @Bean
    int maxBean() {
        return 6;
    }
    @Bean
    int minBean() {
        return 2;
    }

    @Bean
    Review reviewBean1() {
        return new Review("Очень хорошо", 4);
    }

    @Bean
    Review reviewBean2() {
        return new Review("Сойдет", 3);
    }

    @Bean
    Review reviewBean3(int randomBean) {
        return new Review("Сложно сказать", randomBean);
    }

    @Bean
    Review maxReviewBean(Review[] reviews) {
//        List<Review> list = new ArrayList<>(Arrays.asList(reviewBean1, reviewBean2, reviewBean3));

        if(reviews[0].grade > reviews[1].grade && reviews[0].grade > reviews[2].grade) {
            return reviews[0];
        } else if (reviews[1].grade < reviews[0].grade && reviews[1].grade > reviews[2].grade) {
            return reviews[1];
        } else {
            return reviews[2];
        }
    }

    @Bean
    Student studentBean(String name, List<Integer> grades, Predicate range) {
        return new Student(name, grades, range);
    }
}
