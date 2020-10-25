package com.company;

public class Review implements Comparable<Review>{
    int id;
    String description;
    double stars; // 1 - 5

    public Review(int id, double stars) {
        this.id = id;
        this.stars = stars;
    }

    public double getStars() {
        return this.stars;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(Review r) {
        if (this.getStars() < r.getStars()) {
            return 1;
        } else {
            return -1;
        }
    }
}
