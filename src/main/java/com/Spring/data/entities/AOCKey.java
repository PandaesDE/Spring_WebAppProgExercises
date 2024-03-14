package com.Spring.data.entities;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AOCKey implements Serializable {
    private int year;

    private int day;
    public AOCKey() {
    }
    public AOCKey(int year, int day) {
        this.year = year;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AOCKey aocKey = (AOCKey) o;
        return year == aocKey.year && day == aocKey.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, day);
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }
}
