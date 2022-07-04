package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(required = false) Integer count) {
        List<Car> cars = Car.getCars();
        if (count != null) {
            if (count < 5) cars = Car.getCars().subList(0, count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
