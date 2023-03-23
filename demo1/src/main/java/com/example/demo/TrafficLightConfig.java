package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class TrafficLightConfig {
    @Bean
    Colorable green(@Lazy Colorable yellowToRed) {
        return new Color("green", yellowToRed);
    }
    @Bean
    Colorable yellowToRed(@Lazy Colorable red) {
        return new Color("yellow", red);
    }
    @Bean
    Colorable yellowToGreen(@Lazy Colorable green) {
        return new Color("yellow", green);
    }
    @Bean
    Colorable red(@Lazy Colorable yellowToGreen) {
        return new Color("red", yellowToGreen);
    }
    @Bean
    Colorable black(@Lazy Colorable green) {
        return new Color("green", green);
    }



    @Bean
    TrafficLight trafficLightBean(Colorable black) {
        return new TrafficLight(black);
    }
}
