package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TrafficLightConfig.class);
		TrafficLight tf = (TrafficLight) context.getBean("trafficLightBean");
		tf.nextColor();
		tf.nextColor();
		tf.nextColor();
		tf.nextColor();
		tf.nextColor();

		tf.nextColor();
	}

}
