package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Porcshe", 1985, "Yellow"));
        cars.add(new Car("Toyota", 1986, "Blue"));
        cars.add(new Car("Mercedes", 1987, "Red"));
        cars.add(new Car("BMW", 1988, "Blue"));
        cars.add(new Car("Honda", 1989, "Yellow"));
        return cars;
    }

}
