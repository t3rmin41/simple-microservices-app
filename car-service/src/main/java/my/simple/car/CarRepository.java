package my.simple.car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import my.vehicle.entity.Car;

import org.springframework.stereotype.Repository;

@Repository
public class CarRepository {

    private Map <Long, Car> cars = new HashMap<Long, Car>();
    
    private CarRepository() {
        cars.put(1L, new Car(){
            {
                setId(1L);
                setModel("S600");
                setManufacturer("Mercedes");
                setPrice(1000.52);
            }
        });
        cars.put(2L, new Car(){
            {
                setId(2L);
                setModel("S80");
                setManufacturer("Volvo");
                setPrice(500.27);
            }
        });
    }

    public List<Car> getAllCars() {
        return new ArrayList<Car>(cars.values());
    }
    
    public Car getCarById(Long id) {
        return cars.get(id);
    }
} 
