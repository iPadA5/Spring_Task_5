package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porcshe", 1985, "Yellow"));
        cars.add(new Car("Toyota", 1986, "Blue"));
        cars.add(new Car("Mercedes", 1987, "Red"));
        cars.add(new Car("BMW", 1988, "Blue"));
        cars.add(new Car("Honda", 1989, "Yellow"));
        model.addAttribute("cars", cars);
        int limit = Math.min(count, cars.size());
        List<Car> carsToShow = cars.subList(0, limit);
        model.addAttribute("cars", carsToShow);
        return "cars";
    }
}
