package com.example.abc.abc.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Abc")
public class Abc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "heading")
    private String heading;

    public Abc() {}

    public Abc(int id, String heading) {
        this.id = id;
        this.heading = heading;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
