package my.vehicle.entity;

import java.util.List;

public class VehicleSummary {

    private List<Car> cars;
    private List<Truck> trucks;

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
