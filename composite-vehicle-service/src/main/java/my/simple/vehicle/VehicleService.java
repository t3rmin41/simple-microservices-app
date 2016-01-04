package my.simple.vehicle;

import java.util.List;

import javax.inject.Inject;

import my.vehicle.entity.Car;
import my.vehicle.entity.Truck;
import my.vehicle.entity.VehicleSummary;

import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Inject
    private CarClient carClient;
    
    @Inject
    private TruckClient truckClient;
    
    public VehicleSummary getAllVehicles() {
        
        List<Car> cars = carClient.getAllCars();
        List<Truck> trucks = truckClient.getTrucks();
        
        VehicleSummary summary = new VehicleSummary();
        
        summary.getCars().addAll(cars); // since we ensured that getCars() won't return null,
        // we add carClient.getAllCars() [which can be null eventually] to not null 'cars'  
        summary.getTrucks().addAll(trucks);
        
        return summary;
    }
}
