package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class TrafficLight {
    Colorable color;

    public TrafficLight(Colorable color) {
        this.color = color;
    }

    public Colorable getColor() {
        return color;
    }

    public void nextColor() {
        System.out.println(color.nextColor());
        color = color.nextColor();
    }
}
