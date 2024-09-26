package org.javaacademy.homework.homework4.ex3;

import java.util.List;
import java.util.stream.Stream;

public class Runner {
    private static final int ONE_KILOMETER = 1000;

    public static void main(String[] args) {
        //Задание №3 - Небоскребы, небоскребы, а я...
        //1. Создать Класс Небоскреб - имя небоскреба, его высота в метрах.
        //2. Необходимо создать небоскребы:
        //Всемирный торговый центр - 541м
        //Шанхайская башня - 632м
        //Бурдж-Халифа - 828м
        //Международный финансовый центр Пинань - 599м
        //Абрадж аль-Бейт - 601м
        //Всемирный центр Лотте - 555м
        List<Skyscraper> skyscrapers = List.of(
                new Skyscraper("Всемирный торговый центр", 541),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555));

        skyscrapers.stream()
                   .distinct()
                   .forEach(e -> System.out.println(e));
        System.out.println("_____________________");

        skyscrapers.stream()
                   .limit(3)
                   .forEach(e -> System.out.println(e));

        System.out.println("_____________________");
        skyscrapers.stream()
                   .max((a, b) -> a.getHeight() - b.getHeight())
                   .ifPresentOrElse(e -> System.out.println(e),
                                   () -> System.out.println(" "));

        System.out.println("______________________");
        skyscrapers.stream()
                   .filter(e -> e.getHeight() > ONE_KILOMETER)
                   .findAny()
                   .ifPresentOrElse(e -> System.out.println(e),
                                   () -> System.out.println("небоскреба выше километра - нет"));
    }
}
