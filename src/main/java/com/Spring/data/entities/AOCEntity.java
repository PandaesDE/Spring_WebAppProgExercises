package com.Spring.data.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "AOC")
public class AOCEntity {
    @EmbeddedId
    private AOCKey key;
    private String name;
    private String path;

}

