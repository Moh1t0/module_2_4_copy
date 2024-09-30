package org.javaacademy.lesson10.ex1;

import java.util.List;

public class Storage {

    private List<?> product;

    public Storage(List<? extends Product> products) {
        this.product = products;
    }

    public void addProducts(Product products) {
//        product.add(products);
    }

    @Override
    public String toString() {
        return "Storage{" +
                "product=" + product +
                '}';
    }
}
