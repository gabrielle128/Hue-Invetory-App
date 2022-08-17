package com.example.myapplication;

import java.util.HashMap;
import java.util.Map;

public class Shoe {
    Map<String, String> database = new HashMap<>();
    String name, size, color;
    Integer count = 0;

    public Shoe(String code) {
        database.put("10001", "LeBlanc");
        database.put("02", "beige");
        database.put("03", "white");

        name = database.get(code.substring(0, 5));
        size = code.substring(5, 7);
        color = database.get(code.substring(7, 9));
    }

    public void AddInv() {
        count = count + 1;
    }
}