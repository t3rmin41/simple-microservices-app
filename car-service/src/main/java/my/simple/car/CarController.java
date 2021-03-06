package my.simple.car;

import java.util.List;

import javax.inject.Inject;

import my.vehicle.entity.Car;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableHystrix
@Controller
public class CarController {

    @Inject
    private CarService carService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
	@ResponseBody
    @HystrixCommand(commandKey = "getCars", groupKey = "Cars")
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List<Car> getCars() {
        return carService.getAllCars();
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
	@ResponseBody
	@HystrixCommand(commandKey = "getCars", groupKey = "Cars", fallbackMethod = "getCarByIdError")
    @RequestMapping(value = "/cars/{carId}", method = RequestMethod.GET)
    public Car getCarById(@PathVariable("carId") Long carId) {
        return carService.getCarById(carId);
    }
    
    @HystrixCommand
    private Car getCarByIdError(Long carId) {
        return new Car();
    }
    
}
