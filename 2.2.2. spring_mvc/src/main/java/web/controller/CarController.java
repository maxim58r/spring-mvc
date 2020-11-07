package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

/**
 * @author Serov Maxim
 */
@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) int count, Model model) { //http://localhost:8080/cars?numberOfCars=4
        model.addAttribute("cars", carService.listCars(count));
        return "one/cars";
    }

    @GetMapping(value = "/id")
    public String showOneCar(@RequestParam(value = "id", required = false) int id, Model model) { //http://localhost:8080/cars?numberOfCars=4
        model.addAttribute("id", carService.showOneCar(id));
        return "one/id";
    }



    @GetMapping(value = "/{id}")
    public String showCar(@PathVariable("id") int id, Model model) {
        model.addAttribute("car", carService.showOneCar(id));
        return "one/car";
    }
}
