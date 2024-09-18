package org.javaacademy.homework.homework2;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("____________________________");
        ex2();
    }

    private static final int LUGAGGE_BELT = 10;

    private static void ex1() {

        LinkedList<String> luggageLine = new LinkedList<>();
        String fileName = "luggage.csv";
        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String fields = scanner.nextLine();
                String[] parts = fields.split(";");
                luggageLine.add(parts[0]);
            }
        }
        int count = 0;
        while (!luggageLine.isEmpty()) {
            System.out.println("Начинается загрузка на ленту");
            for (int i = 0; i < LUGAGGE_BELT; i++) {
                String luggage = luggageLine.poll();
                count++;
                System.out.println(count + " " + luggage + " выдан");

            }
            System.out.println("Лента окончена,багаж выдан");
        }
    }

    private static final int LUGGAGE_WEIGHT_IN_FILE = 1;

    private static void ex2() {

        String fileName = "luggage.csv";
        HashMap<String, Integer> luggageWeight = new HashMap<>();
        luggageWeight.put("Легкий", 0);
        luggageWeight.put("Средний", 0);
        luggageWeight.put("Тяжелый", 0);

        try (Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String fields = scanner.nextLine();
                String[] parts = fields.split(";");
                int weight = Integer.parseInt(parts[LUGGAGE_WEIGHT_IN_FILE]);
                if (weight < 5) {
                    addWeight("Легкий", weight, luggageWeight);
                } else if (weight < 10) {
                    addWeight("Средний", weight, luggageWeight);
                } else {
                    addWeight("Тяжелый", weight, luggageWeight);
                }
            }
            System.out.println("легкий " + luggageWeight.get("Легкий"));
            System.out.println("средний " + luggageWeight.get("Средний"));
            System.out.println("Тяжелый " + luggageWeight.get("Тяжелый"));
        }
    }

    private static void addWeight(String luggage, Integer weight, HashMap<String, Integer> luggageWeight) {
        luggageWeight.put(luggage, luggageWeight.getOrDefault(luggage, 0) + weight);
    }

}
