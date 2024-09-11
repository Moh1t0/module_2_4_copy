package org.javaacademy.lesson5.ex2;

public class LinkedHashSet {
    public static void main(String[] args) {
        //Уникальные значения сохраняющие порядок вставки
        java.util.LinkedHashSet<String> stations = new java.util.LinkedHashSet<>();
        stations.add("Станция №1");
        stations.add("Станция №2");
        stations.add("Станция №3");
        stations.add("Станция №3");
        System.out.println(stations);
    }
}
