package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Serov Maxim
 */
@Component
public class CarDao {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "X1", 170));
        cars.add(new Car("BMW", "X3", 230));
        cars.add(new Car("BMW", "X5", 260));
        cars.add(new Car("BMW", "X6", 330));
        cars.add(new Car("BMW", "X7", 550));
    }

    public List<Car> listCars(int numberOfCars) {
        return cars.stream()
                .filter(p -> (numberOfCars > 0 && numberOfCars <= cars.size()))
                .limit(numberOfCars)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public Car showOneCar(int id) {

        if (id > 0 && id <= cars.size()) {
            return cars.get(id-1);
        }
        return new Car();

    }
}
