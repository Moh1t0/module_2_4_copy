package org.javaacademy.homework.homework4.ex2;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
        //2. Создать стрим у набора
        //2.1 Посчитать количество букв "о" в одном слове
        //2.2 Посчитать сумму количества букв "о" во всех словах из набора
        //2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
        //
        //ожидаемый результат:
        //6

        Set<String> words = Set.of("тон", "тополь", "боль", "рой", "стройка");
        Stream<String> wordsO = words.stream();
        wordsO
                .map(word -> change(word))
                .reduce((a,b) -> a + b)
                .ifPresentOrElse(e -> System.out.println(e), () -> System.out.println(0));
    }

    private static Integer change(String word) {
        char[] arrayChar = word.toCharArray();
        int countO = 0;
        for (char words : arrayChar) {
            if (words == 'о') {
                countO++;
            }
        }
        return countO;
    }















}
