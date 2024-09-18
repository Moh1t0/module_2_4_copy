package org.javaacademy.homework.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        //Задание №4: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать класс животное (длина тела, длина хвоста)
        //Создать класс лодка(длина)
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка, возвращает длину лодки
        //Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста
        Ruler<Animal> animalRuler = animal -> animal.getBodyLength() + animal.getTailLength();
        System.out.println(animalRuler.measure(new Animal(20, 20)));
        Ruler<Boat> boatRuler = boat -> boat.getLength();
        System.out.println(boatRuler.measure(new Boat(20)));
    }
}
