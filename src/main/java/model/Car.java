package model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private int series;
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BadRoad", "black", 2));
        cars.add(new Car("Fury", "red", 1));
        cars.add(new Car("Painter", "white", 3));
        cars.add(new Car("Tiger", "orange", 2));
        cars.add(new Car("Joker", "green", 4));
        cars.add(new Car("Sigma", "blue", 0));
    }

    public Car(String model, String color, int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSeries() {
        return series;
    }

    public static List<Car> getCars() {
        return cars;
    }
}
