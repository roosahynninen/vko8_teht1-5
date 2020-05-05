package com.example.vko8_teht1_5;

public class Bottle {

    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;

    public Bottle(String n, String man, double totE, double s, double p) {
        name = n;
        manufacturer = man;
        total_energy = totE;
        size = s;
        price = p;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getEnergy() {
        return total_energy;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
