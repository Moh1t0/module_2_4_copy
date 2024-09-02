package org.javaacademy.homework.homework1.ex1.animal;

public class Zoo <B extends Animal, D extends Animal, T extends Animal> {
    private B animal1;
    private D animal2;
    private T animal3;

    public Zoo(B animal1, D animal2, T animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public B getAnimal1() {
        return animal1;
    }

    public D getAnimal2() {
        return animal2;
    }

    public T getAnimal3() {
        return animal3;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animal1=" + animal1 +
                ", animal2=" + animal2 +
                ", animal3=" + animal3 +
                '}';
    }
}
