package com.arraylist;

import java.util.Objects;

public class Phone {
    private String brand;
    private String model;
    private int memory;
    private double price;

    public Phone(String brand, String model, int memory, double price) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{brand='" + brand + "', model='" + model
                + "', memory=" + memory + "GB, price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return memory == phone.memory
                && Double.compare(price, phone.price) == 0
                && Objects.equals(brand, phone.brand)
                && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, memory, price);
    }
}
