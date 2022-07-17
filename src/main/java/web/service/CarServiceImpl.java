package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCarList() {
        return carDao.getCars();
    }

    public List<Car> getCarList(int count) {
        List<Car> cars = getCarList();
        if (count < 5) cars = cars.subList(0, count);
        return cars;
    }
}
