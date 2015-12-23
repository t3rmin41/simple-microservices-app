package my.simple.vehicle;

import java.util.List;

import my.vehicle.entity.Car;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "car-service")
interface CarClient {

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    List<Car> getAllCars();
    
    @RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
    Car getCarById(@PathVariable("id") Long id);
}
