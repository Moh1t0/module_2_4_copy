package org.javaacademy.homework.homework1.ex1;

import org.javaacademy.homework.homework1.ex1.animal.Bird;
import org.javaacademy.homework.homework1.ex1.animal.Dog;
import org.javaacademy.homework.homework1.ex1.animal.Tiger;
import org.javaacademy.homework.homework1.ex1.animal.Zoo;

public class Runner {
    public static void main(String[] args) {
        Zoo<Bird, Dog, Tiger> zoo = new Zoo<>(new Bird(), new Dog(), new Tiger());
        Bird bird = zoo.getAnimal1();
        Dog dog = zoo.getAnimal2();
        bird.fly();
        dog.burk();
    }
}
