package org.javaacademy.homework.homework3;

import org.javaacademy.homework.homework3.ex5.Review;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {

        Review review1 = new Review(7, "Нормальный товар", 100, LocalDateTime.of(2024, 1,
                25, 16, 37));
        Review review2 = new Review(12, "Хороший товар", 200, LocalDateTime.of(2024, 1,
                25, 13, 37));
        Review review4 = new Review(3, "Плохой товар", 100, LocalDateTime.of(2024, 1,
                25, 13, 37));
        Review review3 = new Review(1, "Не плохой товар", 100, LocalDateTime.of(2024, 1,
                25, 13, 37));

        Comparator<Review> reviewComparator = (rev1, rev2) -> {
            if (rev1.getLike() < rev2.getLike())
                return 1;
            else if (rev1.getLike() > rev2.getLike())
                return -1;
            else {
                if (rev1.getDateTime().isBefore(rev2.getDateTime())) {
                    return 1;
                } else if (rev1.getDateTime().isAfter(rev2.getDateTime())) {
                    return -1;
                } else {
                    if (rev1.getId() > rev2.getId()) {
                        return 1;
                    } else if (rev1.getId() < rev2.getId()) {
                        return -1;
                    }
                    return 0;
                }
            }
        };
        TreeSet<Review> reviews = new TreeSet<>(reviewComparator);
        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);
        reviews.add(review4);
        for (Review review : reviews) {
            System.out.printf("0тзыв №%d, %s, %d, %s%n",
                    review.getId(),
                    review.getText(),
                    review.getLike(),
                    review.getDateTime());
        }



        //Задание №5: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
        //Создать коллекцию, которая хранит отсортированные отзывы по:
        // 1.лайкам
        // 2.(Если лайки совпадают) дата + время отзыва
        // 3.(Если лайки и дата + время отзыва совпадают) id

        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
    }
}
