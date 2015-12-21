package my.simple.truck;

import java.util.List;

import javax.inject.Inject;

import my.vehicle.entity.Truck;

import org.springframework.stereotype.Component;

@Component
public class TruckService {

    @Inject
    private TruckRepository truckRepo;
    
    public List<Truck> getAllTrucks() {
        return truckRepo.getAllTrucks();
    }
    
    public Truck getTruckById(Long id) {
        return truckRepo.getTruckById(id);
    }
}
