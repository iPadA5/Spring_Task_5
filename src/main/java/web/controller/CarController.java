package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carService.getCars();
        model.addAttribute("cars", cars);
        int limit = Math.min(count, cars.size());
        List<Car> carsToShow = cars.subList(0, limit);
        model.addAttribute("cars", carsToShow);
        return "cars";
    }
}
