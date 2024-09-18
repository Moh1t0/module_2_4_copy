package org.javaacademy.homework.homework3.ex1;

import org.javaacademy.homework.homework3.ex1.fruits.Apple;
import org.javaacademy.homework.homework3.ex1.fruits.Apricot;
import org.javaacademy.homework.homework3.ex1.fruits.Fruit;

import java.util.Random;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleGarden = () -> new Apple();
        Apple apple = appleGarden.grow();
        Garden<Apricot> apricotGarden = () -> new Apricot();
        Apricot apricot = apricotGarden.grow();

    }
}
