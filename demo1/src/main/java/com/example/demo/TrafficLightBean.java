package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class TrafficLightBean {
    @Bean
    Colorable green(@Lazy Colorable yellowToRed) {
        return new Color("green", yellowToRed);
    }
    @Bean
    Colorable yellowToRed(@Lazy Colorable red) {
        return new Color("yellow", red);
    }
    @Bean
    Colorable red(@Lazy Colorable yellowToGreen) {
        return new Color("red", yellowToGreen);
    }

    @Bean
    Colorable yellowToGreen(@Lazy Colorable green) {
        return new Color("yellow", green);
    }

    @Bean
    TrafficLight trafficLight() {
        return new TrafficLight(new Color());
    }
}
