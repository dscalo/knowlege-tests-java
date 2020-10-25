package com.company;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void returnsTopThreeReviews() {
        ArrayList<Review> reviews = new ArrayList<>();

        reviews.add(new Review(1, 4.5));
        reviews.add(new Review(2, 3.8));
        reviews.add(new Review(3, 4.7));
        reviews.add(new Review(4, 4.1));

        int[] expected = new int[]{3,1,4};

        int[] results = Main.getTopThreeReviews(reviews);

        assertArrayEquals(expected,results, "arrays do not equal!");

    }

    @org.junit.jupiter.api.Test
    void lessThanThreeGoodReviews() {
        ArrayList<Review> reviews = new ArrayList<>();

        reviews.add(new Review(22, 2.6));
        reviews.add(new Review(23, 1.8));
        reviews.add(new Review(234, 0.8));
        reviews.add(new Review(26, 3.8));
        reviews.add(new Review(2345, 1.8));
        reviews.add(new Review(1, 2.5));
        reviews.add(new Review(2, 3.8));
        reviews.add(new Review(3, 4.7));
        reviews.add(new Review(4, 4.1));

        int[] expected = new int[3];
        expected[0] = 3;
        expected[1] = 4;

        int[] results = Main.getTopThreeReviews(reviews);

        assertArrayEquals(expected,results, "arrays do not equal!");
    }

    @org.junit.jupiter.api.Test
    void noGoodReviews() {
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1, 2.5));
        reviews.add(new Review(2, 3.8));
        reviews.add(new Review(3, 3.2));
        reviews.add(new Review(4, 3.1));

        int[] expected = new int[3];

        int[] results = Main.getTopThreeReviews(reviews);

        assertArrayEquals(expected,results, "arrays do not equal!");
    }

    @org.junit.jupiter.api.Test
    void noReviews() {
        ArrayList<Review> reviews = new ArrayList<>();
        int[] expected = new int[3];

        int[] results = Main.getTopThreeReviews(reviews);

        assertArrayEquals(expected,results, "arrays do not equal!");
    }

    @org.junit.jupiter.api.Test
    void twoGoodReviews() {
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1, 4.5));
        reviews.add(new Review(2, 4.8));
        int[] expected = new int[3];
        expected[0] = 2;
        expected[1] = 1;

        int[] results = Main.getTopThreeReviews(reviews);

        assertArrayEquals(expected,results, "arrays do not equal!");
    }

    @org.junit.jupiter.api.Test
    void oneGoodOneBadReviews() {
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1, 4.5));
        reviews.add(new Review(2, 3.8));
        int[] expected = new int[3];
        expected[0] = 1;


        int[] results = Main.getTopThreeReviews(reviews);

        assertArrayEquals(expected,results, "arrays do not equal!");
    }

}