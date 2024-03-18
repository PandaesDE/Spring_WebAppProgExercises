package com.Spring.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "AOC")
public class AOCEntity {
    @EmbeddedId
    private AOCKey key;
    private String name;
    private String input;
}

