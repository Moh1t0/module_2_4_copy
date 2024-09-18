package org.javaacademy.homework.homework3.ex4;

public class Animal {
    private Integer bodyLength;
    private Integer tailLength;

    public Animal(Integer bodyLength, Integer tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public Integer getBodyLength() {
        return bodyLength;
    }

    public Integer getTailLength() {
        return tailLength;
    }
}
