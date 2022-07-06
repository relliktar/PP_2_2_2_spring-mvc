package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BadRoad", "black", 2));
        cars.add(new Car("Fury", "red", 1));
        cars.add(new Car("Painter", "white", 3));
        cars.add(new Car("Tiger", "orange", 2));
        cars.add(new Car("Joker", "green", 4));
        cars.add(new Car("Sigma", "blue", 0));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
