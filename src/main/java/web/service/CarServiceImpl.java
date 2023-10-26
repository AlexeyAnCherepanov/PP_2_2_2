package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1234, "Black"));
        cars.add(new Car("Mercedes", 5678, "Silver"));
        cars.add(new Car("Mitsubishi", 912, "White"));
        cars.add(new Car( "KIA", 20, "Red"));
        cars.add(new Car( "UAZ", 94165161, "Green"));
        cars.add(new Car( "UAZ", 94165161, "Green"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
