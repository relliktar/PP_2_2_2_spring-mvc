package web.controller;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(required = false) Integer count) {
        List<Car> cars = carService.getCarList();
        if (count != null) {
            if (count < 5) cars = cars.subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
