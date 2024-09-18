package org.javaacademy.homework.homework3.ex2;

import org.javaacademy.homework.homework3.ex1.Garden;

import java.util.Comparator;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {

        Divination<String> chamomile = guess -> guess.length() % 2 == 0;
        System.out.println(chamomile.guess("Иван"));
        System.out.println(chamomile.guess("Александр"));

        System.out.println("__________________________");

        Divination<Human> fortuneTeller = human -> human.getAge() + human.getHight() > 210; {
            Human human = new Human(20, 191);
            System.out.println(fortuneTeller.guess(human));
            Human human1 = new Human(17, 186);
            System.out.println(fortuneTeller.guess(human1));
        }

    }
}
