package org.javaacademy.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {

        Burn<Uranus> nuclearReactor = uranus -> System.out.println("Зеленый свет вокруг!");
        nuclearReactor.burned(new Uranus());
        Burn<Tree> fire = tree -> System.out.println("Желтко- красный свет вокруг!");
        fire.burned(new Tree());
    }
}
