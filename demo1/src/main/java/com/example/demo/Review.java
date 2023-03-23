package com.example.demo;

public class Review {
    String str;
    int grade;

    public Review() {
    }

    public Review(String str) {
        this.str = str;
    }

    public Review(String str, int grade) {
        this.str = str;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Review{" +
                "str='" + str + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getStr() {
        return str;
    }

    public int getGrade() {
        return grade;
    }
}
