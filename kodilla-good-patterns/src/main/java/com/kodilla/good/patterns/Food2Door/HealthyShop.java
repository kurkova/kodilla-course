package com.kodilla.good.patterns.Food2Door;

public class HealthyShop extends Shop {
    public String name = "LightFood";

    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
