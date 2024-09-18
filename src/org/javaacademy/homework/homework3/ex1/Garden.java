package org.javaacademy.homework.homework3.ex1;

import org.javaacademy.homework.homework3.ex1.fruits.Fruit;

@FunctionalInterface
public interface Garden<T extends Fruit> {

    T grow();
}
