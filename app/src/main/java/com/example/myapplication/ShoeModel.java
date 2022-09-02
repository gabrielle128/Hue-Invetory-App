package com.example.myapplication;

import java.io.Serializable;

public class ShoeModel implements Serializable {

    private String name;

    public ShoeModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
