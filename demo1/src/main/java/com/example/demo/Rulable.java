package com.example.demo;

import java.util.function.Predicate;

public interface Rulable extends Predicate{
    public Predicate rule();
}
