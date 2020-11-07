package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

/**
 * @author Serov Maxim
 */
@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> listCars(int numberOfCars) {
        return carDao.listCars(numberOfCars);
    }

    public Car showOneCar(int id) {
        return carDao.showOneCar(id);
    }
}
