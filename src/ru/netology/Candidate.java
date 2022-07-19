package ru.netology;

import java.util.Objects;

public class Candidate implements Comparable<Candidate> {

    String fio;
    String male;
    String age;
    int relevance;
    int rating;

    public Candidate(String fio, String male, String age, int relevance, int rating) {
        this.fio = fio;
        this.male = male;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    public String getFio() {
        return fio;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Candidate { " +
                "fio = '" + fio + '\'' +
                ", male = '" + male + '\'' +
                ", age = '" + age + '\'' +
                ", relevance = " + relevance +
                ", rating = " + rating +
                " } \n";
    }

    @Override
    public int compareTo(Candidate o) {
        if (relevance < o.relevance) {
            return 1;
        } else if (relevance > o.relevance) {
            return -1;
        } else {
            if (rating < o.rating) {
                return 1;
            } else if (rating > o.rating) {
                return -1;
            } else {
                return getFio().compareTo(o.getFio());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidate)) return false;
        Candidate candidate = (Candidate) o;
        return getFio().equals(candidate.getFio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFio());
    }
}
