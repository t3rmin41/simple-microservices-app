package my.vehicle.entity;

import java.util.ArrayList;
import java.util.List;

public class VehicleSummary extends ResponseEntity{

    private List<Car> cars = new ArrayList<Car>(); // this way we ensure that 'cars' is not null
    private List<Truck> trucks = new ArrayList<Truck>(); // this way we ensure that 'trucks' is not null

    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
    public List<Truck> getTrucks() {
        return trucks;
    }
    public void setTrucks(List<Truck> trucks) {
        this.trucks = trucks;
    }
}
