package web.dao;

import web.model.Car;

import java.util.List;

/**
 * @author Serov Maxim
 */
public interface CarDao {
    public List<Car> listCars(int numberOfCars);
    public Car showOneCar(int id);
}
