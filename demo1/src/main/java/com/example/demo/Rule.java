package com.example.demo;

import java.util.function.Predicate;

public class Rule implements Rulable{
    @Override
    public Predicate<Integer> rule() {
        return x -> x >= 2 && x <= 5;
    }

    @Override
    public boolean test(Object o) {
        return false;
    }

    @Override
    public Predicate and(Predicate other) {
        return Rulable.super.and(other);
    }

    @Override
    public Predicate negate() {
        return Rulable.super.negate();
    }

    @Override
    public Predicate or(Predicate other) {
        return Rulable.super.or(other);
    }
}
