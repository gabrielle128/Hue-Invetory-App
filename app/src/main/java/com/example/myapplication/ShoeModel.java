package com.example.myapplication;

import java.io.Serializable;

public class ShoeModel implements Serializable {

    private String name;
    private String barcode;
    private String size;
    private String quantity;

    public ShoeModel(String name, String barcode, String size, String quantity) {
        this.name = name;
        this.barcode = barcode;
        this.size = size;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
