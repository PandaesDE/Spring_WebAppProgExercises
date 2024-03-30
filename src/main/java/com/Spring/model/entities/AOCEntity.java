package com.Spring.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "AOC")
public class AOCEntity {
    @EmbeddedId
    private AOCKey key;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String input;


    public AOCEntity(int year, int day) {
        key = new AOCKey(year, day);
    }

    public AOCEntity() {

    }

    public AOCKey getKey() {
        return key;
    }

    public void setKey(AOCKey key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}

