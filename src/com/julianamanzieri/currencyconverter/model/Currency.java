package com.julianamanzieri.currencyconverter.model;

public class Coin {
    private String name;
    private String code;

    public Coin(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
