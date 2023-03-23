package com.example.demo;

import com.example.demo.*;

import java.util.Objects;

public class Color implements Colorable {

    String name;
    Colorable next;

    public Color() {
    }

    public Color(String name, Colorable next) {
        this.name = name;
        this.next = next;
    }

    public Colorable nextColor() {
        return next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colorable getNext() {
        return next;
    }

    public void setNext(Colorable next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(name, color.name) && Objects.equals(next, color.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, next);
    }

    @Override
    public String toString() {
        return name;
    }
}
