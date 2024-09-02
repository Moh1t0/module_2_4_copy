package org.javaacademy.homework.homework1.ex1.animal;

public class Bird extends Animal {
    public void fly(){
        System.out.println("Птичка летит");
    }

    @Override
    public String toString() {
        return "Bird{}";
    }
}
