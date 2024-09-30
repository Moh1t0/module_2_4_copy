package org.javaacademy.lesson10.ex1;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Cola> colas = List.of(new Cola(20), new Cola(30));
        Storage storage = new Storage(colas);
        storage.addProducts(new Juice(33));
        System.out.println(storage);
    }
}
