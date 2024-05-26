package ru.sasulin.spring;

import lombok.Getter;

public class Review {
    public String review;
    @Getter
    public int grade;

    public Review(String review, int grade) {
        this.review = review;
        this.grade = grade;
    }

    private Review() {
    }
}
