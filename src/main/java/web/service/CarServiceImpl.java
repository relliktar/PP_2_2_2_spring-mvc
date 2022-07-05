package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private CarDao carDao;
    @Autowired
    public void setCarDao(CarDao carDao){
        this.carDao = carDao;
    }

    public List<Car> getCarList(){
        return carDao.getCars();
    }
}
