package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Predicate;

@Configuration
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
    @Scope("prototype")
    Review reviewBean1() {
        return new Review("Очень хорошо", 4);
    }

    @Bean
    @Scope("prototype")
    Review reviewBean2() {
        return new Review("Сойдет", 3);
    }

    @Bean
    @Scope("prototype")
    Review reviewBean3(int randomBean) {
        return new Review("Сложно сказать", randomBean);
    }

    @Bean
    @Lazy
    Review maxReviewBean(Review[] reviews) {
        int max = reviews[0].grade;
        int c = 0;
        for (int i = 1; i < reviews.length; i++) {
            if (reviews[i].grade > max) {
                max = reviews[i].grade;
                c = i;
            }
        }
        return reviews[c];
    }

    @Bean
    Student studentBean(Predicate<Integer> predicateBean) {
        return new Student("Arthur", new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)), predicateBean);
    }

    @Bean
    void studentBuilderBean() {

    }
}
