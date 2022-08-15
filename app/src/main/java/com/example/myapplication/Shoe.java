package com.example.myapplication;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Shoe {
    Map<String, String> database = new HashMap<>();
    String name, size, color;

    public Shoe(String code) {
        database.put("10001", "LeBlanc");
        database.put("02", "beige");

        name = database.get(code.substring(0, 5));
        size = code.substring(5, 7);
        color = database.get(code.substring(7, 9));
    }
}