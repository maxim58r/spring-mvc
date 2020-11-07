package web.service;

import web.model.Car;

import java.util.List;

/**
 * @author Serov Maxim
 */
public interface CarService {
    public List<Car> listCars(int numberOfCars);
    public Car showOneCar(int id);
}
