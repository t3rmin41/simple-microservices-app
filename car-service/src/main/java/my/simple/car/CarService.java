package my.simple.car;

import java.util.List;

import javax.inject.Inject;

import my.vehicle.entity.Car;

import org.springframework.stereotype.Component;

@Component
public class CarService {

    @Inject
    private CarRepository carRepo;
    
    public List<Car> getAllCars() {
        return carRepo.getAllCars();
    }
    
    public Car getCarById(Long id) {
        return carRepo.getCarById(id);
    }
}
