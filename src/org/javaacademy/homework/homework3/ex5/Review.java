package org.javaacademy.homework.homework3.ex5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Review {
    //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
    // дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
    //Создать коллекцию, которая хранит отсортированные отзывы по:
    private int id;
    private String text;
    private int like;
    private LocalDateTime dateTime;

    public Review(int id, String text, int like, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.like = like;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getLike() {
        return like;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", like=" + like +
                ", dateTime=" + dateTime +
                '}';
    }
}
